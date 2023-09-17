package ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.impl;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;

public class CppDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Cpp developer writes cpp code");
  }
}
