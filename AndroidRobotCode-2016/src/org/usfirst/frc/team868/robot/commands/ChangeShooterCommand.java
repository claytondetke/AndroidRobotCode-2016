package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.BackShooterSubsystem;
import org.usfirst.frc.team868.robot.subsystems.FrontShooterSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChangeShooterCommand extends Command {

	private FrontShooterSubsystem frontMotor;
	private BackShooterSubsystem  backMotor;
	private double changeAmount;
	
    public ChangeShooterCommand(double power) {
        frontMotor = FrontShooterSubsystem.getInstance();
        backMotor  = BackShooterSubsystem.getInstance();
        
        requires(frontMotor);
        requires(backMotor);
        
        this.changeAmount = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	double frontPower = frontMotor.getPower();
    	double backPower  = backMotor.getPower();
    	
    	frontPower = frontPower + changeAmount;
    	backPower  = backPower  + changeAmount;
    	
    	frontPower = Math.max(Math.min(frontPower, 1), -1);
    	backPower  = Math.max(Math.min(backPower,  1), -1);
    	
    	frontMotor.setPower(frontPower);
    	backMotor.setPower(backPower);
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
    	end();
    }
}
