package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;

public interface ProjectAbstractFactory {
  Developer receiveDeveloper();

  Tester reveiveTester();

  ProjectManager receiveProjectManager();
}
