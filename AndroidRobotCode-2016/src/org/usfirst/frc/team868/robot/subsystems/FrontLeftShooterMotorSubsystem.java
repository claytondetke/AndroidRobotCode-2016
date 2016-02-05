package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class FrontLeftShooterMotorSubsystem extends ShooterMotorSubsystem {

	public static FrontLeftShooterMotorSubsystem instance;
	
    public FrontLeftShooterMotorSubsystem() {
    	isInverted = RobotMap.FRONT_LEFT_SHOOTER_INVERTED;
    }
    
    public static FrontLeftShooterMotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontLeftShooterMotorSubsystem();
    	}
    	return instance;
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Front_Left_Shooter_Power", getPower());
    }

	@Override
	public void initDefaultCommand() {
    	driveMotor = new Victor(RobotMap.FRONT_LEFT_SHOOTER);
		// TODO Auto-generated method stub
		
	}
}

