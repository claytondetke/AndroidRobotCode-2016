package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class BackShooterSubsystem extends Subsystem {
	
	private Victor leftMotor;
	private Victor rightMotor;
	private boolean isLeftInverted;
	private boolean isRightInverted;
	private static BackShooterSubsystem instance;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void setPower(double power) {
    	power = Math.min(power, 1);
    	power = Math.max(power, 0);
    	if(isRightInverted)
    		rightMotor.set(-power);
    	else
    		rightMotor.set(power);
    	if(isLeftInverted)
    		leftMotor.set(-power);
    	else
    		leftMotor.set(power);
    }

    public static BackShooterSubsystem getInstance() {
    	if(instance == null) {
    		instance = new BackShooterSubsystem();
    	}
    	return instance;
    }
    
    public void stopPower() {
    	setPower(0);
    }
    
    public double getPower() {
    	return rightMotor.get();
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Back_Shooter_Motors_Power", getPower());
    }

    public void initDefaultCommand() {
    	isRightInverted = RobotMap.BACK_RIGHT_SHOOTER_INVERTED;
    	isLeftInverted = RobotMap.BACK_LEFT_SHOOTER_INVERTED;
    	rightMotor = new Victor(RobotMap.BACK_RIGHT_SHOOTER);
    	leftMotor = new Victor(RobotMap.BACK_LEFT_SHOOTER);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

