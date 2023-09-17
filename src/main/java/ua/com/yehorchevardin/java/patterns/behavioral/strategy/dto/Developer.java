package ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto;

import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl.Coding;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl.Reading;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl.Sleeping;

public class Developer {
  Activity activity;

  public Developer(Activity activity) {
    this.activity = activity;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  public void executeActivity() {
    activity.justDoIt();
  }
}
