package ua.com.yehorchevardin.java.patterns.structural.composite.dto;

import java.util.ArrayList;

public class Team {
  private final ArrayList<Developer> arrayList = new ArrayList<>();

  public void addDeveloper(Developer developer) {
    arrayList.add(developer);
  }

  public void startCoding() {
    arrayList.forEach(Developer::writeCode);
  }
}
