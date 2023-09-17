package ua.com.yehorchevardin.java.patterns.structural.facade.dto;

public class BugTracker {
  private boolean activeSprint;

  public boolean isActiveSprint() {
    return activeSprint;
  }

  public void startSprint() {
    System.out.println("Started working on sprint");
    activeSprint = true;
  }

  public void finishingSprint() {
    System.out.println("Finishing working on sprint");
    activeSprint = false;
  }
}
