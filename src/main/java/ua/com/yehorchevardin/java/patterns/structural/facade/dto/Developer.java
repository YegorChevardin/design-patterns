package ua.com.yehorchevardin.java.patterns.structural.facade.dto;

public class Developer {
  void doJobBeforeDeadline(BugTracker bugTracker) {
    if (bugTracker.isActiveSprint()) {
      System.out.println("Developer started his job!");
    } else {
      System.out.println("Developer doing nothing....");
    }
  }
}
