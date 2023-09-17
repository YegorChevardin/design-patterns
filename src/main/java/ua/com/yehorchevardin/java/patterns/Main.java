package ua.com.yehorchevardin.java.patterns;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.AbstractFactory;
import ua.com.yehorchevardin.java.patterns.creational.builder.BuilderPattern;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.FactoryMethod;
import ua.com.yehorchevardin.java.patterns.creational.prototype.PrototypePattern;
import ua.com.yehorchevardin.java.patterns.creational.singleton.SingletonPattern;

public class Main {
  public static void main(String[] args) {
    System.out.println("App started!");
    FactoryMethod factoryMethod = new FactoryMethod();
    factoryMethod.execute();
    System.out.println();
    AbstractFactory abstractFactory = new AbstractFactory();
    abstractFactory.execute();
    System.out.println();
    SingletonPattern singletonPattern = new SingletonPattern();
    singletonPattern.execute();
    System.out.println();
    BuilderPattern builderPattern = new BuilderPattern();
    builderPattern.execute();
    System.out.println();
    PrototypePattern prototypePattern = new PrototypePattern();
    prototypePattern.execute();
    System.out.println();
    System.out.println("App finished!");
  }
}
