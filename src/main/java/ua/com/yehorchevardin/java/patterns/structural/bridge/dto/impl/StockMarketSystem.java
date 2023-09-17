package ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.Program;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.ProgramDeveloper;

public class StockMarketSystem extends Program {
  public StockMarketSystem(ProgramDeveloper programDeveloper) {
    super(programDeveloper);
  }

  @Override
  public void developProgram() {
    System.out.println("Stock market system development in progress...");
    programDeveloper.writeCode();
  }
}
