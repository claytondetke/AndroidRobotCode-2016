package org.usfirst.frc.team868.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public abstract class DriveMotorSubsystem extends MotorSubsystem {
    
	protected DriveMotorSubsystem() {
		powerMin = -1;
		powerMax = 1;
	}
    
}

