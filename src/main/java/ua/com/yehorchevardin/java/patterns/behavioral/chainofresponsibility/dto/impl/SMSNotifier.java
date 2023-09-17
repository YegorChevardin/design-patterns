package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.Notifier;

public class SMSNotifier extends Notifier {

  public SMSNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Sending SMS to manager: " + message);
  }
}
