package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class LeftDriveMotorSubsystem extends DriveMotorSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public LeftDriveMotorSubsystem() { //constructor to set default values
		isInverted = RobotMap.LEFT_DRIVE_MOTOR_INVERTED;
	}
	
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new LeftDriveMotorSubsystem();
    	}
    	
    	return instance;
    }

	@Override
	public void initDefaultCommand() {
		driveMotor = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
		// TODO Auto-generated method stub
		
	}
}

