package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.Notifier;

public class EmailNotifier extends Notifier {

  public EmailNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Sending email: " + message);
  }
}
