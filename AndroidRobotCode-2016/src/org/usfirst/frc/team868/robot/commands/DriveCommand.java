package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.DriveMotorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {
	
	private DriveMotorSubsystem driveMotor;
	private double leftPower;
	private double rightPower;
	private double power = 0;
	
    public DriveCommand(double leftPower, double rightPower) {
    	driveMotor = DriveMotorSubsystem.getInstance();
    	requires(driveMotor);
    	this.leftPower = leftPower;
    	this.rightPower = rightPower;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public DriveCommand(double power){
    	this(power, power);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	driveMotor.setLeftPower(leftPower);
    	driveMotor.setRightPower(rightPower);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
