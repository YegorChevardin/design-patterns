package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto;

public abstract class Notifier {
  private int priority;
  private Notifier nextNotifier;

  public Notifier(int priority) {
    this.priority = priority;
  }

  public void setNextNotifier(Notifier nextNotifier) {
    this.nextNotifier = nextNotifier;
  }

  public void notifyManager(String message, int priority) {
    if (priority >= this.priority) {
      write(message);
    }
    if (nextNotifier != null) {
      nextNotifier.notifyManager(message, priority);
    }
  }

  public abstract void write(String message);
}
