package ua.com.yehorchevardin.java.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
  @Override
  public void create(ProjectClass projectClass) {
    System.out.println("Creating good classes...");
  }

  @Override
  public void create(Database database) {
    System.out.println("Creating cool database");
  }

  @Override
  public void create(Test test) {
    System.out.println("Creating cool tests...");
  }
}
