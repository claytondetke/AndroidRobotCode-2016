package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

/**
 *
 */
public class LeftDriveMotorSubsystem extends DriveMotorSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public LeftDriveMotorSubsystem() { //constructor to set default values
		isInverted = RobotMap.LEFT_DRIVE_MOTOR_INVERTED;
		MOTOR_PORT = RobotMap.LEFT_DRIVE_MOTOR;
	}
	
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new LeftDriveMotorSubsystem();
    	}
    	
    	return instance;
    }
}

