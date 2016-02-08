package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;
import org.usfirst.frc.team868.robot.commands.CollectorControllerCommand;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CollectorMotorSubsystem extends Subsystem {
	
	private static CollectorMotorSubsystem instance;
	private Victor colMotor;
	private boolean isInverted;

	public static CollectorMotorSubsystem getInstance(){
		if(instance == null){
			instance = new CollectorMotorSubsystem();
		}
		return instance;
	}
	
	private CollectorMotorSubsystem(){
		colMotor = new Victor(RobotMap.COLLECTOR);
    	isInverted = RobotMap.COLLECTOR_INVERTED;
	}
	
	public void updateSmartDashboard(){
		SmartDashboard.putNumber("Collector_Speed", getPower());
	}
	
	public double getPower(){
		return colMotor.get();
	}
	
	public void setCollector(double power){
		if(isInverted){
			colMotor.set(-power);
		}else{
			colMotor.set(power);
		}
	}
	
	public void stopCollector(){
		setCollector(0);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new CollectorControllerCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

