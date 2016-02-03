package org.usfirst.frc.team868.robot.subsystems;

import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PopperSubsystem extends Subsystem {  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static PopperSubsystem instance;
	private Solenoid pop;
	
	public static PopperSubsystem getInstance(){
		if(instance == null){
			instance = new PopperSubsystem();
		}
		return instance;
	}
	
	private PopperSubsystem(){
		pop = new Solenoid(RobotMap.COLLECTOR_POPPER_SOLENOID);
	}
	
	public boolean getPosition(){
		return pop.get();
	}
	
	public void togglePopper(){
		pop.set(!getPosition());
	}
	
	public void setPopper(boolean activate){
		pop.set(activate);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

