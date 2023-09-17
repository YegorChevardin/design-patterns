package ua.com.yehorchevardin.java.patterns;

import ua.com.yehorchevardin.java.patterns.creational.factorymethod.FactoryMethod;

public class Main {
  public static void main(String[] args) {
    System.out.println("App started!");
    FactoryMethod factoryMethod = new FactoryMethod();
    factoryMethod.execute();

    System.out.println("App finished!");
  }
}
