package org.usfirst.frc.team868.robot.subsystems;
import org.usfirst.frc.team868.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TestMotorsSubsystem extends Subsystem {
    
	private static TestMotorsSubsystem instance;
	private Victor wheel;
	
	private TestMotorsSubsystem(){
		wheel = new Victor(RobotMap.WHEEL);
	}
	
	public void setPower(double speed){
		wheel.set(speed);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static TestMotorsSubsystem getInstance(){
		if(instance == null){
			instance = new TestMotorsSubsystem();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

