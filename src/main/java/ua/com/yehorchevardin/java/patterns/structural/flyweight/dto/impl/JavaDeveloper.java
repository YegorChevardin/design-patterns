package ua.com.yehorchevardin.java.patterns.structural.flyweight.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.flyweight.dto.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("I am writing code on java!");
  }
}
