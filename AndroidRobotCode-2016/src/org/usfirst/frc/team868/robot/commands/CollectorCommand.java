package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.RobotMap;
import org.usfirst.frc.team868.robot.subsystems.CollectorSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CollectorCommand extends Command {
	
	public CollectorSubsystem collect;
	private boolean toggling;
	private boolean position;
	private boolean isInverted;
	private double power = 0;
	
    public CollectorCommand() {
    	collect = CollectorSubsystem.getInstance();
    	isInverted = RobotMap.COLLECTOR_INVERTED;
    	requires(collect);
    	toggling = true;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    
    public CollectorCommand(double power){
    	this();
    	this.power = power;
    	toggling = false;
    }
    
    public CollectorCommand(boolean position){
    	this();
    	this.position = position;
    	toggling = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(toggling){
    		position = !collect.getPosition();
    	}
    	if(power != 0){
    		if(isInverted){
    			collect.setCollector(-power);
    		}else{
    			collect.setCollector(power);
    		}
    	}else{
    		collect.setCollector(position);
    	}
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
