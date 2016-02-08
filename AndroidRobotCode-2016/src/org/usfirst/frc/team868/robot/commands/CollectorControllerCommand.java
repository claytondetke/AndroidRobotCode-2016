package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.RobotMap;
import org.usfirst.frc.team868.robot.subsystems.CollectorMotorSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CollectorControllerCommand extends Command {
	 
	Joystick stick = new Joystick(RobotMap.Joystick.PORT_NUMBER);
	private CollectorMotorSubsystem collect;
	private double speed = 0;

    public CollectorControllerCommand() {
    	collect = CollectorMotorSubsystem.getInstance();
    	requires(collect);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	speed = -stick.getRawAxis(RobotMap.Joystick.LEFT_Y_AXIS);
    	collect.setCollector(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	collect.setCollector(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
