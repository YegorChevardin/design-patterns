package ua.com.yehorchevardin.java.patterns.behavioral.command.dto;

public class Database {
  public void select() {
    System.out.println("Selecting...");
  }

  public void insert() {
    System.out.println("Inserting...");
  }

  public void update() {
    System.out.println("Updating...");
  }

  public void delete() {
    System.out.println("Deleting...");
  }
}
