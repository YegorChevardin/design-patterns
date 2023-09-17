package ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.impl;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Java developer writes java code!");
  }
}
