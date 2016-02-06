package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDriveCommand extends Command {
	
	Joystick tankDrive = new Joystick(0);
	public DriveMotorSubsystem driveMotor;
	public double leftSpeed = 0;
	public double rightSpeed = 0;
	
    public TankDriveCommand() {
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
    	leftSpeed = -tankDrive.getRawAxis(1);
    	rightSpeed = -tankDrive.getRawAxis(3);
    	driveMotor.setLeftPower(leftSpeed);
    	driveMotor.setRightPower(rightSpeed);
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
