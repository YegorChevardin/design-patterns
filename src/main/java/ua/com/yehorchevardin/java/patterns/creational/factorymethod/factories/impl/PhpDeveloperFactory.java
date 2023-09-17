package ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.impl;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.impl.PhpDeveloper;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new PhpDeveloper();
  }
}
