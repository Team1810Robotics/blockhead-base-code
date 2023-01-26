package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.DriveSubsystem;

import java.util.function.DoubleSupplier;

import static frc.robot.Constants.*;

public class TankDrive extends CommandBase {

    private final DoubleSupplier leftInput;
    private final DoubleSupplier rightInput;
    private final DriveSubsystem driveSubsystem;

    public TankDrive(DoubleSupplier leftInput, DoubleSupplier rightInput, DriveSubsystem driveSubsystem) {
        this.leftInput = leftInput;
        this.rightInput = rightInput;

        this.driveSubsystem = driveSubsystem;

        addRequirements(driveSubsystem);
    }

    @Override
    public void execute() {
        driveSubsystem.drive(deadband(leftInput.getAsDouble()),
                             deadband(rightInput.getAsDouble()));
    }

    @Override
    public void end(boolean interrupted) {
        driveSubsystem.stop();
    }

    private double deadband(double value) {
        if (Math.abs(value) < OIConstants.DEADBAND) return 0;

        if (value > 0) {
            return (value - OIConstants.DEADBAND) / (1.0 - OIConstants.DEADBAND);
        } else {
            return (value + OIConstants.DEADBAND) / (1.0 - OIConstants.DEADBAND);
        }
    }
}
