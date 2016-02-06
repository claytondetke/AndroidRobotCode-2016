package org.usfirst.frc.team868.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
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
	Joystick joystick;
	
	public OI(){
		joystick = new Joystick(0);
		
		initSmartDashboard();
		initJoystick();
	}
	
	Button shooterCommandIncrement, shooterCommandDecrement, shooterCommandStop,
		   shooterCommandSet, popperCommandToggle, collectorCommandUp,
		   collectorCommandDown;
	
	public void initJoystick(){
		shooterCommandIncrement = new JoystickButton(joystick, RobotMap.Buttons.Y);
		shooterCommandDecrement = new JoystickButton(joystick, RobotMap.Buttons.A);
		shooterCommandStop      = new JoystickButton(joystick, RobotMap.Buttons.RB);
		shooterCommandSet       = new JoystickButton(joystick, RobotMap.Buttons.B);
		popperCommandToggle     = new JoystickButton(joystick, RobotMap.Buttons.RT);
		collectorCommandUp      = new JoystickButton(joystick, RobotMap.Buttons.LB);
		collectorCommandDown    = new JoystickButton(joystick, RobotMap.Buttons.LT);
		
		shooterCommandIncrement.whenPressed(new ChangeShooterCommand(0.3));
		shooterCommandDecrement.whenPressed(new ChangeShooterCommand(-0.3));
		shooterCommandStop.whenPressed(new ShooterCommand(0));
		shooterCommandSet.whenPressed(new ShooterCommand(0.5));
		popperCommandToggle.whenPressed(new PopperCommand());
		collectorCommandUp.whenPressed(new CollectorCommand(true));
		collectorCommandDown.whenPressed(new CollectorCommand(false));
	}
	
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
		}
		return instance;
	}
	
	public void initSmartDashboard(){
		SmartDashboard.putData("Tank_Drive", new TankDriveCommand());
		SmartDashboard.putData("Toggle_Collector", new CollectorCommand());
		SmartDashboard.putData("Collector_Motor_Run", new CollectorCommand(.5));
		SmartDashboard.putData("STOP_DRIVE", new DriveCommand(0));
	}
}
