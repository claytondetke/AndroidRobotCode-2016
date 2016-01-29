package org.usfirst.frc.team868.robot.commands;

import org.usfirst.frc.team868.robot.subsystems.TestMotorsSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TestMotorsCommand extends Command {

    public TestMotorsSubsystem test;
    public double power = 0;
    public double speed = 0;
    public int port = 0;
    
    public TestMotorsCommand(int port, double power){
    	test = TestMotorsSubsystem.getInstance();
    	requires(test);
    	this.port = port;
    	this.power = power;
    }
    
    public TestMotorsCommand(double speed){
    	test = TestMotorsSubsystem.getInstance();
    	requires(test);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(port != 0)
    		test.setMultiPower(port, speed);
    	else
    		test.setPower(speed);
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
