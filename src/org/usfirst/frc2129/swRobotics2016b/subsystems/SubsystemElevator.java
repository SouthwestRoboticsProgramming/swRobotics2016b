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

import org.usfirst.frc2129.swRobotics2016b.Robot;
import org.usfirst.frc2129.swRobotics2016b.RobotMap;
import org.usfirst.frc2129.swRobotics2016b.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class SubsystemElevator extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon cTalonElevator = RobotMap.subsystemElevatorcTalonElevator;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public Encoder encoder = new Encoder(6, 7, false, EncodingType.k4X);

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new CommandElevatorStop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        Robot.preferences.putDouble("PowerElevatorUp", 0.25);
        Robot.preferences.putDouble("PowerElevatorDown", -0.5);
        encoder.setDistancePerPulse(1.0);
    }
    
  //Set Elevator motor to go up
    public void ElevatorUp() {
    	double PowerElevatorUp = Robot.preferences.getDouble("PowerElevatorUp", 0.25);
    	cTalonElevator.set(PowerElevatorUp);
    }
    
    //Set Elevator motor to go down
    public void ElevatorDown() {
    	double PowerElevatorDown = Robot.preferences.getDouble("PowerElevatorDown", -0.5);
    	cTalonElevator.set(PowerElevatorDown);
    }
    
    //Set Elevator motor to stop
    public void ElevatorStop() {
    	cTalonElevator.set(0.0);
//    	cTalonElevator.
    }
    
    public CANTalon getCANTalon(){
    	return this.cTalonElevator;
    }
}

