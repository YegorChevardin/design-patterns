package ua.com.yehorchevardin.java.patterns.structural.composite.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.composite.dto.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("I am writing cool code on java!");
  }
}
