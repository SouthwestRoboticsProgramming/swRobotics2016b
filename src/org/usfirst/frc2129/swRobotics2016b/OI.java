// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2129.swRobotics2016b;

import org.usfirst.frc2129.swRobotics2016b.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    
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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shooterIntake;
    public JoystickButton buttonElevatorUp;
    public JoystickButton buttonElevatorDown;
    public JoystickButton buttonRollerIntake;
    public JoystickButton buttonRollerOutput;
    public Joystick leftJoystick;
    public JoystickButton shooterSpinUp;
    public JoystickButton shooterFire;
    public Joystick rightJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
    	System.out.println("swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b swRobotics2016b");
    	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        rightJoystick = new Joystick(1);
        
        shooterFire = new JoystickButton(rightJoystick, 2);
        shooterFire.whenPressed(new commandGroup_Fire());
        shooterSpinUp = new JoystickButton(rightJoystick, 1);
        shooterSpinUp.whileHeld(new CommandGroupSpinUp());
        leftJoystick = new Joystick(0);
        
        buttonRollerOutput = new JoystickButton(leftJoystick, 5);
        buttonRollerOutput.whileHeld(new IntakeRoller_SpinForOutput());
        buttonRollerIntake = new JoystickButton(leftJoystick, 4);
        buttonRollerIntake.whileHeld(new intakeRoller_spinForIntake());
        buttonElevatorDown = new JoystickButton(leftJoystick, 3);
        buttonElevatorDown.whileHeld(new ElevatorDown());
        buttonElevatorUp = new JoystickButton(leftJoystick, 2);
        buttonElevatorUp.whileHeld(new ElevatorUp());
        shooterIntake = new JoystickButton(leftJoystick, 1);
        shooterIntake.whileHeld(new shooterSpinner_spinWheelsForIntake());


        // SmartDashboard Buttons
        SmartDashboard.putData("CommandGroupPickUpBall", new CommandGroupPickUpBall());
        SmartDashboard.putData("CommandGroupSpinUp", new CommandGroupSpinUp());
        SmartDashboard.putData("commandGroup_Fire", new commandGroup_Fire());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("shooterSpinner_spinWheelsForLaunch", new shooterSpinner_spinWheelsForLaunch());
        SmartDashboard.putData("shooterSpinner_spinWheelsForIntake", new shooterSpinner_spinWheelsForIntake());
        SmartDashboard.putData("shooterSpinner_stopShooterWheels", new shooterSpinner_stopShooterWheels());
        SmartDashboard.putData("shooterPusher_moveBallPusherToLaunch", new shooterPusher_moveBallPusherToLaunch());
        SmartDashboard.putData("shooterPusher_moveBallPusherForIntake", new shooterPusher_moveBallPusherForIntake());
        SmartDashboard.putData("intakeRoller_spinStop", new intakeRoller_spinStop());
        SmartDashboard.putData("IntakeRoller_SpinForOutput", new IntakeRoller_SpinForOutput());
        SmartDashboard.putData("ElevatorUp", new ElevatorUp());
        SmartDashboard.putData("ElevatorDown", new ElevatorDown());
        SmartDashboard.putData("ElevatorStop", new ElevatorStop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    
        // Display status of Scheduler in SmartDashboard. This displays
        // all the commands and "Cancel" buttons for each command. 
        // ==========================================================
        SmartDashboard.putData(Scheduler.getInstance());
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getleftJoystick() {
        return leftJoystick;
    }

    public Joystick getrightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

