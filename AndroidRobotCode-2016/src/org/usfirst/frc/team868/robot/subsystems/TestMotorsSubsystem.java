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
	private Victor wheel2;
	private Victor wheel3;
	
	private TestMotorsSubsystem(){
		wheel = new Victor(RobotMap.COLLECTOR);
		wheel2 = new Victor(RobotMap.BACK_LEFT_SHOOTER);
		wheel3 = new Victor(RobotMap.BACK_RIGHT_SHOOTER);
	}
	
	public void setPower(double speed){
		wheel.set(speed);
	}
	
	public void setMultiPower(int select, double speed){
		if(select == 4){
			wheel2.set(speed);
		}else if(select == 5){
			wheel3.set(speed);
		}else{
			wheel.set(speed);
		}
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

