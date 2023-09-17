package ua.com.yehorchevardin.java.patterns.behavioral.observer;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.Observer;
import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.impl.JavaDeveloperJobSite;
import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.impl.Subscriber;

public class ObserverPattern implements PatternExplanation {
  @Override
  public void execute() {
    JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

    javaDeveloperJobSite.addVacancy("First java position");
    javaDeveloperJobSite.addVacancy("Second Java position");

    Observer subscriber1 = new Subscriber("Fist name");
    Observer subscriber2 = new Subscriber("Second name");

    javaDeveloperJobSite.addObserver(subscriber1);
    javaDeveloperJobSite.addObserver(subscriber2);

    javaDeveloperJobSite.addVacancy("Cool java vacancy");
    javaDeveloperJobSite.removeObserver(subscriber2);
    javaDeveloperJobSite.removeVacancy("Cool java vacancy");
  }
}
