package ua.com.yehorchevardin.java.patterns.structural.flyweight.dto;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
  public void run() {
    DeveloperFactory developerFactory = new DeveloperFactory();
    List<Developer> developers = new ArrayList<>();

    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));
    developers.add(developerFactory.getDeveloperBySpeciality("cpp"));

    for (Developer developer : developers) {
      developer.writeCode();
    }
  }
}
