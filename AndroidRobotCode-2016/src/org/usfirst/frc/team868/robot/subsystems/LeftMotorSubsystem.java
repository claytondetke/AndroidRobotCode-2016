package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

/**
 *
 */
public class LeftMotorSubsystem extends MotorSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public LeftMotorSubsystem() { //constructor to set default values
		isInverted  = true;
		MOTOR_PORT = RobotMap.LEFT_DRIVE_MOTOR;
	}
	
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new LeftMotorSubsystem();
    	}
    	
    	return instance;
    }
}

