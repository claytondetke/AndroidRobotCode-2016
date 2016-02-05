package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BackLeftShooterMotorSubsystem extends ShooterMotorSubsystem {

	public static BackLeftShooterMotorSubsystem instance;
	
    public BackLeftShooterMotorSubsystem() {
    	isInverted = RobotMap.BACK_LEFT_SHOOTER_INVERTED;
    }
    
    public static BackLeftShooterMotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new BackLeftShooterMotorSubsystem();
    	}
    	return instance;
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Back_Left_Shooter_Power", getPower());
    }

	@Override
	public void initDefaultCommand() {
    	driveMotor = new Victor(RobotMap.BACK_LEFT_SHOOTER);
		// TODO Auto-generated method stub
		
	}
}

