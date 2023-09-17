package ua.com.yehorchevardin.java.patterns.behavioral.template.dto;

public class WelcomePage extends WebsiteTemplate {
  @Override
  protected void showPageContent() {
    System.out.println("Footer");
  }
}
