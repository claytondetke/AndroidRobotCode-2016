package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LeftDriveMotorSubsystem extends Subsystem {

	protected boolean isInverted = RobotMap.LEFT_DRIVE_MOTOR_INVERTED; //set by actual constructor
	public Victor  driveMotor; //set by super method (see below) //cannot have abstract getInstance method!
	public static LeftDriveMotorSubsystem instance;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void setPower(double power) {
    	power = Math.min(power, 1);
    	power = Math.max(power, -1);
    	driveMotor.set(power);
    }
	
	public LeftDriveMotorSubsystem(){
		isInverted = RobotMap.LEFT_DRIVE_MOTOR_INVERTED;
		driveMotor = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
	}
    
    public void stopPower() {
    	setPower(0);
    }
    
    public double getPower() {
    	return driveMotor.get();
    }
	
    public static LeftDriveMotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new LeftDriveMotorSubsystem();
    	}
    	
    	return instance;
    }

	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}

