package ua.com.yehorchevardin.java.patterns.behavioral.template;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.template.dto.NewsPage;
import ua.com.yehorchevardin.java.patterns.behavioral.template.dto.WelcomePage;

public class TemplatePattern implements PatternExplanation {
  @Override
  public void execute() {
    WelcomePage welcomePage = new WelcomePage();
    NewsPage newsPage = new NewsPage();

    welcomePage.showPage();
    newsPage.showPage();
  }
}
