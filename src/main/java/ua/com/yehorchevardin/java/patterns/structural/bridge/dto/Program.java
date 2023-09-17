package ua.com.yehorchevardin.java.patterns.structural.bridge.dto;

public abstract class Program {
  protected ProgramDeveloper programDeveloper;

  protected Program(ProgramDeveloper programDeveloper) {
    this.programDeveloper = programDeveloper;
  }

  public abstract void developProgram();
}
