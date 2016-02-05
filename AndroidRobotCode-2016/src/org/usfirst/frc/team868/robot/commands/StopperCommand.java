package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.StopperSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopperCommand extends Command {
	
	private StopperSubsystem stopper;
	private boolean toggle;
	
    public StopperCommand() {
    	stopper = StopperSubsystem.getInstance();
    	requires(stopper);
    	toggle = !stopper.getPosition();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	stopper.setStopper(toggle);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
