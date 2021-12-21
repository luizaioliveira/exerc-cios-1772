package frc.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {
  SpeedControllerGroup motoresEsquerda, motoresDireita;
  DifferentialDrive tracao;
  Joystick joystick;

  @Override
  public void robotInit() {
    motoresEsquerda = new SpeedControllerGroup(new VictorSP(0), new VictorSP(1));
    motoresDireita = new SpeedControllerGroup(new VictorSP(2), new VictorSP(3));

    tracao = new DifferentialDrive(motoresEsquerda, motoresDireita);
  }

  @Override
  public void robotPeriodic() {
    joystick = new Joystick(0);
  }

  @Override
  public void autonomousInit() {
    
  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {

  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {

  }

  @Override
  public void testInit() {

  }

  @Override
  public void testPeriodic() {

  }
}
