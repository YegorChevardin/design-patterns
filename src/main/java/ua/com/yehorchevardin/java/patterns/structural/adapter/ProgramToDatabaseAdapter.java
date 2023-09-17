package ua.com.yehorchevardin.java.patterns.structural.adapter;

public class ProgramToDatabaseAdapter extends ExampleProgram implements Database {
  @Override
  public void insert() {
    saveObject();
  }

  @Override
  public void read() {
    loadObject();
  }

  @Override
  public void update() {
    updateObject();
  }

  @Override
  public void delete() {
    deleteObject();
  }
}
