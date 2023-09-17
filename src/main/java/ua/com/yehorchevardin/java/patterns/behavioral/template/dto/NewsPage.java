package ua.com.yehorchevardin.java.patterns.behavioral.template.dto;

public class NewsPage extends WebsiteTemplate {
  @Override
  protected void showPageContent() {
    System.out.println("News");
  }
}
