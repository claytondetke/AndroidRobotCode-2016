package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BackLeftShooterMotorSubsystem extends ShooterMotorSubsystem {
    
    public BackLeftShooterMotorSubsystem() {
    	isInverted = false;
    	MOTOR_PORT = RobotMap.BACK_LEFT_SHOOTER;
    }
    
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new BackLeftShooterMotorSubsystem();
    	}
    	return instance;
    }
}

