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

import org.usfirst.frc2129.swRobotics2016b.commands.CommandAutonomous;
import org.usfirst.frc2129.swRobotics2016b.subsystems.CameraSubsystem;
import org.usfirst.frc2129.swRobotics2016b.subsystems.PowerDistribution;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemDrive;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemElevator;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemIntakeRoller;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemPusher;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemSpinners;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemTilter;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemUltrasonic;
import org.usfirst.frc2129.swRobotics2016b.subsystems.SubsystemUltrasonic2;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static Preferences preferences;
	CameraServer server;

    Command autonomousCommand;

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SubsystemDrive subsystemDrive;
    public static SubsystemSpinners subsystemSpinners;
    public static SubsystemIntakeRoller subsystemIntakeRoller;
    public static PowerDistribution powerDistribution;
    public static SubsystemPusher subsystemPusher;
    public static SubsystemElevator subsystemElevator;
    public static SubsystemUltrasonic subsystemUltrasonic;
    public static SubsystemUltrasonic2 subsystemUltrasonic2;
    public static SubsystemTilter subsystemTilter;
	public static CameraSubsystem cameraSubsystem;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
	    RobotMap.init();
	    
		server = CameraServer.getInstance();
		server.setQuality(25);
		server.startAutomaticCapture("cam0");
//		server.
		
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        subsystemDrive = new SubsystemDrive();
        subsystemSpinners = new SubsystemSpinners();
        subsystemIntakeRoller = new SubsystemIntakeRoller();
        powerDistribution = new PowerDistribution();
        subsystemPusher = new SubsystemPusher();
        subsystemElevator = new SubsystemElevator();
        subsystemUltrasonic = new SubsystemUltrasonic();
        subsystemUltrasonic2 = new SubsystemUltrasonic2();
        subsystemTilter = new SubsystemTilter();
        cameraSubsystem = new CameraSubsystem();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        autonomousCommand = new CommandAutonomous();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
        // Make the Preferences available to the app through Robot.preferences
        // ===================================================================
        preferences = Preferences.getInstance();
        
        // Display the status of each of the subsystems in SmartDashboard
        // ===============================================================
        SmartDashboard.putData(subsystemDrive);
        //SmartDashboard.putData(subsystemElevator);
        //SmartDashboard.putData(subsystemSpinners);
        //SmartDashboard.putData(subsystemPusher);
        //SmartDashboard.putData(subsystemIntakeRoller);
        //SmartDashboard.putData(powerDistribution);
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {

    	Telemetry.initDriveCurrent();
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        Telemetry.reportDrivePower(subsystemDrive, powerDistribution);
        Telemetry.LogEncoder("leftDrive", RobotMap.subsystemDriveEncoderDriveLeft);
        Telemetry.LogEncoder("rightDrive", RobotMap.subsystemDriveEncoderDriveRight);
        Telemetry.LogEncoder("armLifter", Robot.subsystemElevator.encoder);
        Telemetry.LogEncoder("tilter", Robot.subsystemTilter.encoder);
    }


    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
