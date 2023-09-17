package ua.com.yehorchevardin.java.patterns.structural.flyweight.dto;

import ua.com.yehorchevardin.java.patterns.structural.flyweight.dto.impl.CppDeveloper;
import ua.com.yehorchevardin.java.patterns.structural.flyweight.dto.impl.JavaDeveloper;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DeveloperFactory {
  private static final Map<String, Developer> developerMap = new HashMap<>();

  public Developer getDeveloperBySpeciality(String speciality) {
    Developer returnDeveloper = developerMap.get(speciality);

    if (returnDeveloper == null) {
      switch (speciality) {
        case "java" -> {
          System.out.println("Hiring new java developer");
          returnDeveloper = new JavaDeveloper();
        }
        case "cpp" -> {
          System.out.println("Hiring new cpp developer");
          returnDeveloper = new CppDeveloper();
        }
        default -> throw new IllegalArgumentException("Speciality not valid!");
      }
      developerMap.put(speciality, returnDeveloper);
    }
    return returnDeveloper;
  }
}
