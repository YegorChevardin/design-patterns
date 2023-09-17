package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;

public class PhpDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Coding website on php!");
  }
}
