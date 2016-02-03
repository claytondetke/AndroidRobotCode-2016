package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class RightDriveMotorSubsystem extends DriveMotorSubsystem {
    
	public static RightDriveMotorSubsystem instance;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public RightDriveMotorSubsystem() { //constructor to set default values
		isInverted = RobotMap.RIGHT_DRIVE_MOTOR_INVERTED;
	}
	
    public static RightDriveMotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new RightDriveMotorSubsystem();
    	}
    	
    	return instance;
    }

	@Override
	public void initDefaultCommand() {
		driveMotor = new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
		// TODO Auto-generated method stub
		
	}
}

