package ua.com.yehorchevardin.java.patterns.creational.builder.builders;

import ua.com.yehorchevardin.java.patterns.creational.builder.dto.Website;

public abstract class WebsiteBuilder {
  protected Website website;

  public WebsiteBuilder createWebsite() {
    website = new Website();
    return this;
  }

  public abstract WebsiteBuilder buildPrice();

  public abstract WebsiteBuilder buildCms();

  public abstract WebsiteBuilder buildName();

  public Website getWebsite() {
    return website;
  }
}
