package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveMotorSubsystem extends Subsystem {
    
	public static DriveMotorSubsystem instance;
	public boolean isLeftInverted;
	public boolean isRightInverted;
	private Victor leftMotor;
	private Victor rightMotor;
	
	public void setLeftPower(double power) {
    	power = Math.min(power, 1);
    	power = Math.max(power, -1);
    	if(isLeftInverted)
    		leftMotor.set(-power);
    	else
    		leftMotor.set(power);
    }
	
	public void setRightPower(double power){
		power = Math.min(power, 1);
		power = Math.max(power, -1);
		if(isRightInverted)
			rightMotor.set(-power);
		else
			rightMotor.set(power);
	}
	
	public static DriveMotorSubsystem getInstance(){
		if(instance == null){
			instance = new DriveMotorSubsystem();
		}
		return instance;
	}
    
    public void stopPower() {
    	setLeftPower(0);
    	setRightPower(0);
    }
    
    public double getRightPower() {
    	return rightMotor.get();
    }
    
    public double getLeftPower(){
    	return leftMotor.get();
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putNumber("Right_Drive_Power", getRightPower());
    	SmartDashboard.putNumber("Left_Drive_Power", getLeftPower());
    }
    
    public DriveMotorSubsystem(){
		isLeftInverted = RobotMap.LEFT_DRIVE_MOTOR_INVERTED;
		isRightInverted = RobotMap.RIGHT_DRIVE_MOTOR_INVERTED;
		rightMotor = new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
		leftMotor = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
    }
    
	protected void initDefaultCommand() {
	}
}

