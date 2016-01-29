package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	
	private static DriveSubsystem instance;
	private Victor leftDrive;
	private Victor rightDrive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
    	leftDrive = new Victor(RobotMap.LEFT_DRIVE_MOTOR);
    	rightDrive = new Victor(RobotMap.RIGHT_DRIVE_MOTOR);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setLeftPower(double power){
    	power = Math.min((Math.max(power, 1)), -1);
    	leftDrive.set(-power);
    }
    
    public void setRightPower(double power){
    	power = Math.min((Math.max(power, 1)), -1);
    	rightDrive.set(power);
    }
    
    public void stopPower(){
    	setRightPower(0);
    	setLeftPower(0);
    }
    
    public double getRightPower(){
    	return rightDrive.get();
    }
    
    public double getLeftPower(){
    	return leftDrive.get();
    }
    
    public static DriveSubsystem getInstance(){
    	if(instance == null){
    		instance = new DriveSubsystem();
    	}
    	return instance;
    }
}

