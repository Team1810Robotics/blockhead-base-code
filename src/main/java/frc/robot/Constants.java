package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {
        public static final int RIGHT_MOTOR_ID = 0;
        public static final int LEFT_MOTOR_ID = 1;

        public static final boolean RIGHT_MOTOR_INVERTED = false;
        public static final boolean LEFT_MOTOR_INVERTED = true;
    }

    public static final class OIConstants {
        public static final int LEFT_JOYSTICK_ID = 0;
        public static final int RIGHT_JOYSTICK_ID = 1;

        public static final double DEADBAND = 0.3;
    }
}
