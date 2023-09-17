package ua.com.yehorchevardin.java.patterns.structural.decorator.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public String writeCode() {
    return "I am writing java code!";
  }
}
