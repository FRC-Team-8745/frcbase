/*
This is a base program based off of the sweeper code in the drivetrain.
*/
package frc.robot;

    //import your motor controllers, compressors, solenoids, and physical controllers using this pattern.
    import edu.wpi.first.wpilibj.XboxController;
    import edu.wpi.first.wpilibj.Spark;
    import edu.wpi.first.wpilibj.Compressor;
    import edu.wpi.first.wpilibj.Solenoid;

public class Sweeper {
    //set your pistons to default positions
    public static boolean fourBarS = false;
    public static boolean compressorT = false;
    //name your motors, controller, and make the public static void drive here.
    public static Spark left = new Spark(0);
    public static Spark right = new Spark(1);
    public static XboxController driver = new XboxController(3);
    public static Compressor compressor = new Compressor();
    public static void drive(){
        //set your speeds
        double speed = 0.5;
    }
}
