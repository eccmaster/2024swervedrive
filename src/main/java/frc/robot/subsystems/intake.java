package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase{
    public CANSparkMax intakeMotor = new CANSparkMax(10, MotorType.kBrushless);
    public RelativeEncoder intakeEncoder = intakeMotor.getEncoder();
   


    public intake() {
        // This method will be called once per scheduler run
        

    }
        
    @Override
    public void periodic() {
    
       // SmartDashboard.putNumber("Intake encoder value", intakeEncoder);

    }

    @Override
    public void simulationPeriodic() {
        // This methos will be called once per scheduler run during simulation
    }


    
}