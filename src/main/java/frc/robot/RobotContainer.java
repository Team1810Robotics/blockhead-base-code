package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveSubsystem;

import static frc.robot.Constants.*;

public class RobotContainer {

    private DriveSubsystem driveSubsystem = new DriveSubsystem();

    private Joystick leftJoystick = new Joystick(OIConstants.LEFT_JOYSTICK_ID);
    private Joystick rightJoystick = new Joystick(OIConstants.RIGHT_JOYSTICK_ID);

    public RobotContainer() {
        driveSubsystem.setDefaultCommand(
            new TankDrive(
                () -> leftJoystick.getY(),
                () -> rightJoystick.getY(),
                driveSubsystem
            )
        );

        configureBindings();
    }

    private void configureBindings() {}

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return null;
    }
}
