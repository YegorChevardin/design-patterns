package ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.impl;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;

public class PhpDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Write php code");
    ;
  }
}
