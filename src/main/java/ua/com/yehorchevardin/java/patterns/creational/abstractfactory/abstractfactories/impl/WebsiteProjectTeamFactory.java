package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.impl;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.ProjectAbstractFactory;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website.PhpDeveloper;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website.WebsiteProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website.WebsiteTester;

public class WebsiteProjectTeamFactory implements ProjectAbstractFactory {
  @Override
  public Developer receiveDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public Tester reveiveTester() {
    return new WebsiteTester();
  }

  @Override
  public ProjectManager receiveProjectManager() {
    return new WebsiteProjectManager();
  }
}
