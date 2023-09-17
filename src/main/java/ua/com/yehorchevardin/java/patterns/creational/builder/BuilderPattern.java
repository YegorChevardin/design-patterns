package ua.com.yehorchevardin.java.patterns.creational.builder;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.creational.builder.builders.WebsiteBuilder;
import ua.com.yehorchevardin.java.patterns.creational.builder.builders.impl.EnterpriseWebsiteBuilder;
import ua.com.yehorchevardin.java.patterns.creational.builder.builders.impl.VisitCardWebsiteBuilder;

public class BuilderPattern implements PatternExplanation {
  @Override
  public void execute() {
    Director director = new Director();
    WebsiteBuilder websiteBuilder = new EnterpriseWebsiteBuilder();
    WebsiteBuilder websiteBuilder1 = new VisitCardWebsiteBuilder();

    System.out.println("Starting creating website");
    director.setBuilder(websiteBuilder);
    System.out.println(director.buildWebsite());
    director.setBuilder(websiteBuilder1);
    System.out.println(director.buildWebsite());
    System.out.println("Website created successfully");
  }
}
