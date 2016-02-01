package org.usfirst.frc.team868.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public abstract class MotorSubsystem extends Subsystem {

	protected boolean isInverted; //set by constructor
	protected int     MOTOR_PORT; //set by constructor
	protected Victor  driveMotor; //set by super method (see below)

	protected static MotorSubsystem instance; //cannot have abstract getInstance method!
	
    public void initDefaultCommand() {
        driveMotor = new Victor(MOTOR_PORT);
    }
    
    public void setPower(double power) {
    	power = Math.max(power, 1);
    	power = Math.min(power, -1);
    	driveMotor.set(power);
    }
    
    public void stopPower() {
    	setPower(0);
    }
    
    public double getPower() {
    	return driveMotor.get();
    }
}

