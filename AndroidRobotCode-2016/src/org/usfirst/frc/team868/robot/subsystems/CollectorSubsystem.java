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
	
	private Solenoid colOpen;
	private Solenoid colClose;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static CollectorSubsystem getInstance(){
		if(instance == null){
			instance = new CollectorSubsystem();
		}
		return instance;
	}
	
	private CollectorSubsystem(){
		colOpen = new Solenoid(RobotMap.COLLECTOR_OPENER_SOLENOID);
		colClose = new Solenoid(RobotMap.COLLECTOR_CLOSER_SOLENOID);
	}
	
	public boolean getPosition(){
		return colOpen.get();
	}
	
	public void setCollector(boolean activate){
		colOpen.set(activate);
		colClose.set(!activate);
	}
	
	public void toggleCollector(){
		setCollector(!getPosition());
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

