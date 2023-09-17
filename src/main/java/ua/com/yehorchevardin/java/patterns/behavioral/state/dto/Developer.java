package ua.com.yehorchevardin.java.patterns.behavioral.state.dto;

import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.impl.Coding;
import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.impl.Reading;
import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.impl.Sleeping;

public class Developer {
  Activity activity;

  public void setActivity(Activity activity) {
    this.activity = activity;
  }

  public void changeActivity() {
    if (activity instanceof Sleeping) {
      activity = new Coding();
    } else if (activity instanceof Coding) {
      activity = new Reading();
    } else {
      activity = new Sleeping();
    }
  }

  public void justDoIt() {
    activity.justDoIt();
  }
}
