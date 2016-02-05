package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.BackShooterSubsystem;
import org.usfirst.frc.team868.robot.subsystems.FrontShooterSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterCommand extends Command {

	private FrontShooterSubsystem frontMotor;
	private BackShooterSubsystem  backMotor;
	private double power;
	
    public ShooterCommand(double power) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	frontMotor = FrontShooterSubsystem.getInstance();
    	backMotor  = BackShooterSubsystem.getInstance();
    	
    	requires(frontMotor);
    	requires(backMotor);
    	
    	this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	frontMotor.setPower(power);
    	backMotor.setPower(power);
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
    	frontMotor.stopPower();
    	backMotor.stopPower();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
