package ua.com.yehorchevardin.java.patterns.behavioral.state.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.Activity;

public class Sleeping implements Activity {
  @Override
  public void justDoIt() {
    System.out.println("I am sleeping!");
  }
}
