package ua.com.yehorchevardin.java.patterns.structural.bridge;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.Program;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl.BankSystem;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl.CppProgramDeveloper;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl.JavaProgramDeveloper;
import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl.StockMarketSystem;

public class BridgePattern implements PatternExplanation {
  @Override
  public void execute() {
    Program[] programs = {
      new BankSystem(new JavaProgramDeveloper()), new StockMarketSystem(new CppProgramDeveloper())
    };

    for (Program program : programs) {
      program.developProgram();
    }
  }
}
