package org.usfirst.frc.team868.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public abstract class ShooterMotorSubsystem extends MotorSubsystem {
    
	protected ShooterMotorSubsystem() {
		powerMin = 0;
		powerMax = 1;
	}
}

