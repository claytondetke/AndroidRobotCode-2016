package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class FrontRightShooterMotorSubsystem extends ShooterMotorSubsystem {

	public static FrontRightShooterMotorSubsystem instance;
	
    public FrontRightShooterMotorSubsystem() {
    	isInverted = RobotMap.FRONT_RIGHT_SHOOTER_INVERTED;
    }
    
    public static FrontRightShooterMotorSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontRightShooterMotorSubsystem();
    	}
    	return instance;
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Front_Right_Shooter_Power", getPower());
    }

	@Override
	public void initDefaultCommand() {
    	driveMotor = new Victor(RobotMap.FRONT_RIGHT_SHOOTER);
		// TODO Auto-generated method stub
		
	}
}

