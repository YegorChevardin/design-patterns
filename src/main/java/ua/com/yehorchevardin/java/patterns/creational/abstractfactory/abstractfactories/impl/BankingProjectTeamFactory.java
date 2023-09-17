package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.impl;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.ProjectAbstractFactory;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking.BankingAppTester;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking.BankingProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking.JavaDeveloper;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;

public class BankingProjectTeamFactory implements ProjectAbstractFactory {
  @Override
  public Developer receiveDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public Tester reveiveTester() {
    return new BankingAppTester();
  }

  @Override
  public ProjectManager receiveProjectManager() {
    return new BankingProjectManager();
  }
}
