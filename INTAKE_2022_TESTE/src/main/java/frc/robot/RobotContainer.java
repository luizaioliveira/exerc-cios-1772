package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Axis;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.OIConstants;

import frc.robot.subsystems.Intake;
import frc.robot.commands.intake.CollectCargo;
import frc.robot.commands.intake.ReleaseCargo;

public class RobotContainer {
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final Intake intake;  
  private final XboxController operator;

  public RobotContainer() {
    this.intake = new Intake();
    this.operator = new XboxController(OIConstants.operatorControllerPort);
    this.configureButtonBindings();
  }
  private void configureButtonBindings() {
    this.configureButtonBindingsIntake();
  }

  private void configureButtonBindingsIntake() {
    var buttonBumperLeft = new JoystickButton(this.operator, Button.kLeftBumper.value);
    var axisTriggerLeft = new JoystickButton(this.operator, Axis.kLeftTrigger.value);

    buttonBumperLeft.whileHeld(new CollectCargo(this.intake));    
    axisTriggerLeft.whileHeld(new ReleaseCargo(this.intake));
  }

  public Command getAutonomousCommand() {
    return m_autoCommand;
  }
}
