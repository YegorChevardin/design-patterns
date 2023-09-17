package ua.com.yehorchevardin.java.patterns.behavioral.iterator;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.iterator.dto.Iterator;
import ua.com.yehorchevardin.java.patterns.behavioral.iterator.dto.JavaDeveloper;

public class IteratorPattern implements PatternExplanation {
  @Override
  public void execute() {
    JavaDeveloper javaDeveloper =
        new JavaDeveloper("CoolName", new String[] {"Java", "Spring", "Hibernate"});
    Iterator<String> iterator = javaDeveloper.getIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
