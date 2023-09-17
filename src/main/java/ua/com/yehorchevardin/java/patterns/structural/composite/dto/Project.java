package ua.com.yehorchevardin.java.patterns.structural.composite.dto;

import ua.com.yehorchevardin.java.patterns.structural.composite.dto.impl.CppDeveloper;
import ua.com.yehorchevardin.java.patterns.structural.composite.dto.impl.JavaDeveloper;

public class Project {
  public void build() {
    Team team = new Team();

    Developer javaDeveloper = new JavaDeveloper();
    Developer javaDeveloper1 = new JavaDeveloper();
    Developer cppDeveloper = new CppDeveloper();

    team.addDeveloper(javaDeveloper);
    team.addDeveloper(javaDeveloper1);
    team.addDeveloper(cppDeveloper);

    team.startCoding();
  }
}
