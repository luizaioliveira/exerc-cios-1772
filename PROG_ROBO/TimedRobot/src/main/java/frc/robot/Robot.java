// Atividade de Luiza Oliveira e Bibiana de Oliveira

package frc.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {
  private VictorSP motorDireitoUm, motorDireitoDois, 
  motorEsquerdoUm, motorEsquerdoDois; 
  private SpeedControllerGroup motoresEsquerda, motoresDireita;
  private DifferentialDrive tracao;
  
  private Joystick joystick;

  @Override
  public void robotInit() {
    motorDireitoUm = new VictorSP(0);
    motorDireitoDois = new VictorSP(1);
    motorEsquerdoUm = new VictorSP(2);
    motorEsquerdoDois= new VictorSP(3);

    motoresDireita = new SpeedControllerGroup(motorDireitoUm, motorDireitoDois);
    motoresEsquerda = new SpeedControllerGroup(motorEsquerdoUm, motorEsquerdoDois);

    tracao = new DifferentialDrive(motoresEsquerda, motoresDireita);
  }

  @Override
  public void robotPeriodic() {
    
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {
    joystick = new Joystick(0);
  }

  @Override
  public void teleopPeriodic() {
    tracao.arcadeDrive(joystick.getY(), joystick.getX());
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
