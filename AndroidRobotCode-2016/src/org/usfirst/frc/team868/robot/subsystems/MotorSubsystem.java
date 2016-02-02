package org.usfirst.frc.team868.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Designed to be extended by an abstract, which is extended by actual
 */
public abstract class MotorSubsystem extends Subsystem {

	protected boolean isInverted; //set by actual constructor
	protected int     MOTOR_PORT; //set by actual constructor
	protected int     powerMin;   //set by abstract constructor
	protected int     powerMax;   //set by abstract constructor
	protected Victor  driveMotor; //set by super method (see below)

	protected static MotorSubsystem instance; //cannot have abstract getInstance method!
	
    public void initDefaultCommand() {
        driveMotor = new Victor(MOTOR_PORT);
    }
    
    public void setPower(double power) {
    	power = Math.max(power, powerMax);
    	power = Math.min(power, powerMin);
    	driveMotor.set(power);
    }
    
    public void stopPower() {
    	setPower(0);
    }
    
    public double getPower() {
    	return driveMotor.get();
    }
}

