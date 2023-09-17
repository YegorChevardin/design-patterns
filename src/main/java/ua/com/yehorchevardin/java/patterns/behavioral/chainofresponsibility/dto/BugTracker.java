package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto;

import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl.EmailNotifier;
import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl.SMSNotifier;
import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.impl.SimpleReportNotifier;

public class BugTracker {
  public void tack() {
    Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
    Notifier emailSendingNotifier = new EmailNotifier(Priority.IMPORTANT);
    Notifier smsNotifier = new SMSNotifier(Priority.CRITICAL);

    reportNotifier.setNextNotifier(emailSendingNotifier);
    emailSendingNotifier.setNextNotifier(smsNotifier);

    reportNotifier.notifyManager("Everything is Okay", Priority.ROUTINE);
    reportNotifier.notifyManager("Everything is not fine...", Priority.IMPORTANT);
    reportNotifier.notifyManager("Everything is crashed", Priority.CRITICAL);
  }
}
