package ua.com.yehorchevardin.java.patterns.behavioral.state;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.Activity;
import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.Developer;
import ua.com.yehorchevardin.java.patterns.behavioral.state.dto.impl.Sleeping;

public class StatePattern implements PatternExplanation {
  @Override
  public void execute() {
    Activity activity = new Sleeping();

    Developer developer = new Developer();
    developer.setActivity(activity);

    for (int i = 0; i < 10; i++) {
      developer.justDoIt();
      developer.changeActivity();
    }
  }
}
