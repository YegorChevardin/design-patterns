package ua.com.yehorchevardin.java.patterns.structural.bridge.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.bridge.dto.ProgramDeveloper;

public class CppProgramDeveloper implements ProgramDeveloper {
  @Override
  public void writeCode() {
    System.out.println("I am writing program on cpp!");
  }
}
