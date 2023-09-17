package ua.com.yehorchevardin.java.patterns.structural.decorator.dto;

import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.impl.JavaDeveloper;
import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.impl.SeniorDeveloperDeveloper;

public class Task {
  public void execute() {
    Developer developer = new SeniorDeveloperDeveloper(new JavaDeveloper());

    System.out.println(developer.writeCode());
    ;
  }
}
