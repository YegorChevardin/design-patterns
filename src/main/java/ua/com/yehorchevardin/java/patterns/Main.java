package ua.com.yehorchevardin.java.patterns;

import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.ChainOfResponsibilityPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.command.CommandPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.InterpreterPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.iterator.IteratorPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.mediator.MediatorPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.memento.MementoPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.observer.ObserverPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.state.StatePattern;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.StrategyPattern;
import ua.com.yehorchevardin.java.patterns.behavioral.template.TemplatePattern;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.AbstractFactory;
import ua.com.yehorchevardin.java.patterns.creational.builder.BuilderPattern;
import ua.com.yehorchevardin.java.patterns.creational.factorymethod.FactoryMethod;
import ua.com.yehorchevardin.java.patterns.creational.prototype.PrototypePattern;
import ua.com.yehorchevardin.java.patterns.creational.singleton.SingletonPattern;
import ua.com.yehorchevardin.java.patterns.structural.adapter.AdapterPattern;
import ua.com.yehorchevardin.java.patterns.structural.bridge.BridgePattern;
import ua.com.yehorchevardin.java.patterns.structural.composite.CompositePattern;
import ua.com.yehorchevardin.java.patterns.structural.decorator.DecoratorPattern;
import ua.com.yehorchevardin.java.patterns.structural.facade.FacadePattern;
import ua.com.yehorchevardin.java.patterns.structural.flyweight.FlyweightPattern;
import ua.com.yehorchevardin.java.patterns.structural.proxy.ProxyPattern;

public class Main {
  public static void main(String[] args) {
    System.out.println("App started!");
    System.out.println("Creation patterns section start");
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
    System.out.println("Structural patterns section start");
    AdapterPattern adapterPattern = new AdapterPattern();
    adapterPattern.execute();
    System.out.println();
    BridgePattern bridgePattern = new BridgePattern();
    bridgePattern.execute();
    System.out.println();
    CompositePattern compositePattern = new CompositePattern();
    compositePattern.execute();
    System.out.println();
    DecoratorPattern decoratorPattern = new DecoratorPattern();
    decoratorPattern.execute();
    System.out.println();
    FacadePattern facadePattern = new FacadePattern();
    facadePattern.execute();
    System.out.println();
    FlyweightPattern flyweightPattern = new FlyweightPattern();
    flyweightPattern.execute();
    System.out.println();
    ProxyPattern proxyPattern = new ProxyPattern();
    proxyPattern.execute();
    System.out.println();
    System.out.println("Behavioral patterns section start");
    ChainOfResponsibilityPattern chainOfResponsibilityPattern = new ChainOfResponsibilityPattern();
    chainOfResponsibilityPattern.execute();
    System.out.println();
    CommandPattern commandPattern = new CommandPattern();
    commandPattern.execute();
    System.out.println();
    InterpreterPattern interpreterPattern = new InterpreterPattern();
    interpreterPattern.execute();
    System.out.println();
    IteratorPattern iteratorPattern = new IteratorPattern();
    iteratorPattern.execute();
    System.out.println();
    MediatorPattern mediatorPattern = new MediatorPattern();
    mediatorPattern.execute();
    System.out.println();
    MementoPattern mementoPattern = new MementoPattern();
    mementoPattern.execute();
    System.out.println();
    ObserverPattern observerPattern = new ObserverPattern();
    observerPattern.execute();
    System.out.println();
    StatePattern statePattern = new StatePattern();
    statePattern.execute();
    System.out.println();
    StrategyPattern strategyPattern = new StrategyPattern();
    strategyPattern.execute();
    System.out.println();
    TemplatePattern templatePattern = new TemplatePattern();
    templatePattern.execute();
    System.out.println();
    System.out.println("App finished!");
  }
}
