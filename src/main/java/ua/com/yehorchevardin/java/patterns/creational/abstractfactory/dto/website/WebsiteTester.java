package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;

public class WebsiteTester implements Tester {
  @Override
  public void testProject() {
    System.out.println("Tests website project!");
  }
}
