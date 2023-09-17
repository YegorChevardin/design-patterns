package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;

public class BankingAppTester implements Tester {
  @Override
  public void testProject() {
    System.out.println("tests written java code for banking system");
  }
}
