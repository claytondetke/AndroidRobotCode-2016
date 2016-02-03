package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BackRightShooterMotorSubsystem extends ShooterMotorSubsystem {
    
    public BackRightShooterMotorSubsystem() {
    	isInverted = RobotMap.BACK_RIGHT_SHOOTER_INVERTED;
    	MOTOR_PORT = RobotMap.BACK_RIGHT_SHOOTER;
    }
    
    public static MotorSubsystem getInstance() {
    	if(instance  == null) {
    		instance = new BackRightShooterMotorSubsystem();
    	}
    	return instance;
    }
}

