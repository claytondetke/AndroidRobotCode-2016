package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.LeftDriveMotorSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LeftDriveCommand extends Command {
	private LeftDriveMotorSubsystem driveMotor;
	private double power = 0;
	public Joystick tankDrive = new Joystick(0);
	public double leftSpeed;

    public LeftDriveCommand(double power) {
    	driveMotor=(LeftDriveMotorSubsystem) LeftDriveMotorSubsystem.getInstance();
    	requires(driveMotor);
    	this.power=power;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public LeftDriveCommand(){
    	driveMotor = (LeftDriveMotorSubsystem) LeftDriveMotorSubsystem.getInstance();
    	requires(driveMotor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	driveMotor.setPower(power);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	leftSpeed = tankDrive.getRawAxis(1);
    	driveMotor.setPower(leftSpeed);
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


