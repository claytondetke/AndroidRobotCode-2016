package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

/**
 *
 */
public class RightMotorSubsystem extends MotorSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public RightMotorSubsystem() { //constructor to set default values
		isInverted  = false;
		MOTOR_PORT = RobotMap.RIGHT_DRIVE_MOTOR;
	}
	
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new RightMotorSubsystem();
    	}
    	
    	return instance;
    }
}

