package org.usfirst.frc.team868.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team868.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private static OI instance;
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public OI(){
		initSmartDashboard();
	}
	
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
		}
		return instance;
	}
	
	public void initSmartDashboard(){
		SmartDashboard.putData("Toggle_Collector", new CollectorCommand());
		SmartDashboard.putData("Collector_Motor_Run", new CollectorCommand(.5));
		SmartDashboard.putData("Left_Drive_Forward", new DriveCommand(0.1, 0));
		SmartDashboard.putData("Left_Drive_Backward", new DriveCommand(-0.1, 0));
		SmartDashboard.putData("Right_Drive_Forward", new DriveCommand(0, 0.1));
		SmartDashboard.putData("Right_Drive_Backward", new DriveCommand(0, -0.1));
		SmartDashboard.putData("Drive_Forward", new DriveCommand(0.3));
		SmartDashboard.putData("Drive_Backwards", new DriveCommand(-0.3));
	}
}

