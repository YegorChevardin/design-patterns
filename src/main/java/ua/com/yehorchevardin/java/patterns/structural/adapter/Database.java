package ua.com.yehorchevardin.java.patterns.structural.adapter;

public interface Database {
  void insert();

  void read();

  void update();

  void delete();
}
