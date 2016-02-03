package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BackRightShooterMotorSubsystem extends ShooterMotorSubsystem {

	public static BackRightShooterMotorSubsystem instance;
	
    public BackRightShooterMotorSubsystem() {
    	isInverted = RobotMap.BACK_RIGHT_SHOOTER_INVERTED;
    }
    
    public static BackRightShooterMotorSubsystem getInstance() {
    	if(instance  == null) {
    		instance = new BackRightShooterMotorSubsystem();
    	}
    	return instance;
    }

	@Override
	public void initDefaultCommand() {
    	driveMotor = new Victor(RobotMap.BACK_RIGHT_SHOOTER);
		// TODO Auto-generated method stub
		
	}
}

