package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FrontLeftShooterMotorSubsystem extends ShooterMotorSubsystem {
    
    public FrontLeftShooterMotorSubsystem() {
    	isInverted = RobotMap.FRONT_LEFT_SHOOTER_INVERTED;
    	MOTOR_PORT = RobotMap.FRONT_LEFT_SHOOTER;
    }
    
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontLeftShooterMotorSubsystem();
    	}
    	return instance;
    }
}

