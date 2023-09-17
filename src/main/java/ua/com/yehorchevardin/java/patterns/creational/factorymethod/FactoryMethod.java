package ua.com.yehorchevardin.java.patterns.creational.factorymethod;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.DeveloperFactory;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.impl.CppDeveloperFactory;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.impl.JavaDeveloperFactory;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.factories.impl.PhpDeveloperFactory;

public class FactoryMethod implements PatternExplanation {
  @Override
  public void execute() {
    DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("Java");
    DeveloperFactory cppDevFact = createDeveloperFactoryBySpeciality("Cpp");
    DeveloperFactory phpDevFactory = createDeveloperFactoryBySpeciality("Php");

    Developer cppDev = cppDevFact.createDeveloper();
    Developer javaDeveloper = developerFactory.createDeveloper();
    Developer phpDeveloper = phpDevFactory.createDeveloper();

    javaDeveloper.writeCode();
    phpDeveloper.writeCode();
    cppDev.writeCode();
  }

  static DeveloperFactory createDeveloperFactoryBySpeciality(String name) {
    switch (name) {
      case "Java":
        return new JavaDeveloperFactory();
      case "Cpp":
        return new CppDeveloperFactory();
      case "Php":
        return new PhpDeveloperFactory();
      default:
        throw new IllegalArgumentException("Specialty is not correct, type or java or cpp!");
    }
  }
}
