package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FrontLeftShooterMotorSubsystem extends ShooterMotorSubsystem {
    
    public FrontLeftShooterMotorSubsystem() {
    	isInverted = RobotMap.FRONT_LEFT_SHOOTER_INVERTED;
    }
    
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontLeftShooterMotorSubsystem();
    	}
    	return instance;
    }

	@Override
	public void initDefaultCommand() {
    	driveMotor = new Victor(RobotMap.FRONT_LEFT_SHOOTER);
		// TODO Auto-generated method stub
		
	}
}

