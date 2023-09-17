package ua.com.yehorchevardin.java.patterns.behavioral.template.dto;

public abstract class WebsiteTemplate {
  public void showPage() {
    System.out.println("Header");
    showPageContent();
    System.out.println("Footer");
  }

  protected abstract void showPageContent();
}
