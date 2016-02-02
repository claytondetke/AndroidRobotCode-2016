package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CollectorSubsystem extends Subsystem {
    
	private static CollectorSubsystem instance;
	
	private Solenoid col1;
	private Solenoid col2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	
	public static CollectorSubsystem getInstance(){
		if(instance == null){
			instance = new CollectorSubsystem();
		}
		return instance;
	}
	
	private CollectorSubsystem(){
		col1 = new Solenoid(RobotMap.COLLECTOR_SOLENOID_1);
		col2 = new Solenoid(RobotMap.COLLECTOR_SOLENOID_2);
	}
	
	public boolean getPosition(){
		return col1.get();
	}
	
	public void setCollector(boolean on){
		col1.set(on);
		col2.set(!on);
	}
	
	public void toggleCollector(){
		setCollector(!getPosition());
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void updateSmartDashboard(){
    	SmartDashboard.putBoolean("Collecting", getPosition());
    }
}

