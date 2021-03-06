
package org.usfirst.frc.team868.robot;
 
import org.usfirst.frc.team868.robot.commands.*;
import org.usfirst.frc.team868.robot.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

    Command autonomousCommand;//Toggles collector to open and closed.
	public DriveCommand driveMotor;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	BackShooterSubsystem.getInstance();
    	CollectorSubsystem.getInstance();
    	CollectorMotorSubsystem.getInstance();
    	FrontShooterSubsystem.getInstance();
    	DriveMotorSubsystem.getInstance();
    	PopperSubsystem.getInstance();
		oi = new OI();
        // instantiate the command used for the autonomous period
    }
    
    public void updateSmartDashboard(){
    	BackShooterSubsystem.getInstance().updateSmartDashboard();
    	CollectorSubsystem.getInstance().updateSmartDashboard();
    	CollectorMotorSubsystem.getInstance().updateSmartDashboard();
    	FrontShooterSubsystem.getInstance().updateSmartDashboard();
    	DriveMotorSubsystem.getInstance().updateSmartDashboard();
    	PopperSubsystem.getInstance().updateSmartDashboard();
    }
	
	public void disabledPeriodic() {
		updateSmartDashboard();
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
    	new DriveCommand(0);
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	updateSmartDashboard();
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	updateSmartDashboard();
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	updateSmartDashboard();
        LiveWindow.run();
    }
}