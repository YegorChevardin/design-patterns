package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.Notifier;

public class SimpleReportNotifier extends Notifier {
  public SimpleReportNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Notifying, using simple report: " + message);
  }
}
