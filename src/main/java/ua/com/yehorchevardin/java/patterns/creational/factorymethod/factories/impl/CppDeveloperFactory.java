package ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.impl;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.impl.CppDeveloper;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new CppDeveloper();
  }
}
