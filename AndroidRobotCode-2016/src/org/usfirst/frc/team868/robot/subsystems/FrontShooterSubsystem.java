package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class FrontShooterSubsystem extends Subsystem {
    
	private Victor leftMotor;
	private Victor rightMotor;
	private boolean isLeftInverted;
	private boolean isRightInverted;
	private static FrontShooterSubsystem instance;
    
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

    public static FrontShooterSubsystem getInstance() {
    	if(instance == null) {
    		instance = new FrontShooterSubsystem();
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
    	SmartDashboard.putNumber("Front_Shooter_Motors_Power", getPower());
    }
    
    public FrontShooterSubsystem(){
    	isRightInverted = RobotMap.FRONT_RIGHT_SHOOTER_INVERTED;
    	isLeftInverted = RobotMap.FRONT_LEFT_SHOOTER_INVERTED;
    	rightMotor = new Victor(RobotMap.FRONT_RIGHT_SHOOTER);
    	leftMotor = new Victor(RobotMap.FRONT_LEFT_SHOOTER);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

