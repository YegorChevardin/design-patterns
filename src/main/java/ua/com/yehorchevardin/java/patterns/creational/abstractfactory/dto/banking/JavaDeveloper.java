package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;

public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Writing java code for banking!");
  }
}
