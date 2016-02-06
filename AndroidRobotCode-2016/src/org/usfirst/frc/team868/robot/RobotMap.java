package org.usfirst.frc.team868.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int RIGHT_DRIVE_MOTOR	 = 1;
	public static final int LEFT_DRIVE_MOTOR 	 = 2;//negative direction
	public static final int FRONT_RIGHT_SHOOTER  = 3;
	public static final int BACK_LEFT_SHOOTER 	 = 4;//------------wire problem
	public static final int BACK_RIGHT_SHOOTER 	 = 5;//-------------wire problem
	public static final int FRONT_LEFT_SHOOTER 	 = 6;//negative direction
	public static final int COLLECTOR 			 = 7;//negative direction
	
	public static final boolean RIGHT_DRIVE_MOTOR_INVERTED    = false;
	public static final boolean LEFT_DRIVE_MOTOR_INVERTED     = true;
	public static final boolean FRONT_RIGHT_SHOOTER_INVERTED  = false;
	public static final boolean BACK_LEFT_SHOOTER_INVERTED    = true;
	public static final boolean BACK_RIGHT_SHOOTER_INVERTED   = false;
	public static final boolean FRONT_LEFT_SHOOTER_INVERTED   = true;
	public static final boolean COLLECTOR_INVERTED			  = true;
	
	public static final int COLLECTOR_OPENER_SOLENOID = 1;
	public static final int COLLECTOR_CLOSER_SOLENOID = 5;
	public static final int COLLECTOR_POPPER_SOLENOID = 4;
	public static final int SHOOTER_STOPPER_SOLENOID = 2;
	
	public static class Buttons{
		public static final int X = 1;
		public static final int A = 2;
		public static final int B = 3;
		public static final int Y = 4;
		public static final int LB = 5;
		public static final int RB = 6;
		public static final int LT = 7;
		public static final int RT = 8;
		public static final int BACK = 9;
		public static final int START = 10;
		public static final int LEFT_STICK = 11;
		public static final int RIGHT_STICK = 12;
	}
	
	public static class Joystick{
		public static final int LEFT_HORIZONTAL_AXIS = 0;	//Right is positive, left is negative
		public static final int LEFT_VERTICAL_AXIS = 1;		//Down is positive, up is negative
		public static final int RIGHT_HORIZONTAL_AXIS = 2;	//Right is positive, left is negative
		public static final int RIGHT_VERTICAL_AXIS = 3;	//Down is positive, up is negative
	}
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
