package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import static frc.robot.Constants.*;

public class DriveSubsystem extends SubsystemBase {
    private Talon leftMotor;
    private Talon rightMotor;

    private DifferentialDrive differentialDrive;

    public DriveSubsystem() {
        leftMotor = new Talon(DriveConstants.LEFT_MOTOR_ID);
        leftMotor.setInverted(DriveConstants.LEFT_MOTOR_INVERTED);

        rightMotor = new Talon(DriveConstants.RIGHT_MOTOR_ID);
        rightMotor.setInverted(DriveConstants.RIGHT_MOTOR_INVERTED);

        differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
    }

    public void drive(double leftSpeed, double rightSpeed) {
        differentialDrive.tankDrive(leftSpeed, rightSpeed, true);
    }

    public void stop() {
        leftMotor.set(0);
        rightMotor.set(0);
    }
}
