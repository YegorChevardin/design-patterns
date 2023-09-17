package ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.Program;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.ProgramDeveloper;

public class BankSystem extends Program {
  public BankSystem(ProgramDeveloper programDeveloper) {
    super(programDeveloper);
  }

  @Override
  public void developProgram() {
    System.out.println("Bank system development is progress...");
    programDeveloper.writeCode();
  }
}
