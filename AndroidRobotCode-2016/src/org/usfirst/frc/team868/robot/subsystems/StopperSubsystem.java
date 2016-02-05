package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StopperSubsystem extends Subsystem {  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static StopperSubsystem instance;
	private Solenoid stop;
	
	public static StopperSubsystem getInstance(){
		if(instance == null){
			instance = new StopperSubsystem();
		}
		return instance;
	}
	
	private StopperSubsystem(){
		stop = new Solenoid(RobotMap.SHOOTER_STOPPER_SOLENOID);
	}
	
	public boolean getPosition(){
		return stop.get();
	}
	
	public void updateSmartDashboard(){
		SmartDashboard.putBoolean("Stopper_Position", getPosition());
	}
	
	public void toggleStopper(){
		stop.set(!getPosition());
	}
	
	public void setStopper(boolean activate){
		stop.set(activate);
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

