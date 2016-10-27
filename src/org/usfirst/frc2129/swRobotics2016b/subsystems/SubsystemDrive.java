// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2129.swRobotics2016b.subsystems;

import org.usfirst.frc2129.swRobotics2016b.RobotMap;
import org.usfirst.frc2129.swRobotics2016b.commands.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class SubsystemDrive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder encoderDriveLeft = RobotMap.subsystemDriveEncoderDriveLeft;
    private final Encoder encoderDriveRight = RobotMap.subsystemDriveEncoderDriveRight;
    private final SpeedController left1 = RobotMap.subsystemDriveleft1;
    private final SpeedController left2 = RobotMap.subsystemDriveleft2;
    private final SpeedController right1 = RobotMap.subsystemDriveright1;
    private final SpeedController right2 = RobotMap.subsystemDriveright2;
    private final RobotDrive tankDrive = RobotMap.subsystemDrivetankDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new CommandDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void DriveCommand(double left, double right)
    {
    	tankDrive.tankDrive(left, right);
    }
}

