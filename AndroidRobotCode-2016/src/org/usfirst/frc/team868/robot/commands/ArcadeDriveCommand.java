package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.DriveMotorSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDriveCommand extends Command {
	
	Joystick ArcadeDrive = new Joystick(0);
	private DriveMotorSubsystem driveMotor;
	private double leftPower = 0;
	private double rightPower = 0;

    public ArcadeDriveCommand() {
    	driveMotor = DriveMotorSubsystem.getInstance();
    	requires(driveMotor);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	leftPower = ;
//    	rightPower = ;
    	driveMotor.setLeftPower(leftPower);
    	driveMotor.setRightPower(rightPower);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	driveMotor.stopPower();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
