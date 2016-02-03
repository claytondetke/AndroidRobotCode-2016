package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FrontRightShooterMotorSubsystem extends ShooterMotorSubsystem {
    
    public FrontRightShooterMotorSubsystem() {
    	isInverted = RobotMap.FRONT_RIGHT_SHOOTER_INVERTED;
    	MOTOR_PORT = RobotMap.FRONT_RIGHT_SHOOTER;
    }
    
    public static MotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontRightShooterMotorSubsystem();
    	}
    	return instance;
    }
}
