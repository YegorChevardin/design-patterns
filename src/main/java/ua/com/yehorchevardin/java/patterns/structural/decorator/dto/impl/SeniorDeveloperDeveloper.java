package ua.com.yehorchevardin.java.patterns.structural.decorator.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.Developer;
import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.DeveloperDecorator;

public class SeniorDeveloperDeveloper extends DeveloperDecorator {
  public SeniorDeveloperDeveloper(Developer developer) {
    super(developer);
  }

  public String makeCodeReview() {
    return "Make code review...";
  }

  @Override
  public String writeCode() {
    return super.writeCode() + "\n" + makeCodeReview();
  }
}
