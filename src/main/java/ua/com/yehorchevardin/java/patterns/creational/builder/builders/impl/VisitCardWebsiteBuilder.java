package ua.com.yehorchevardin.java.patterns.creational.builder.builders.impl;

import ua.com.yehorchevardin.java.patterns.creational.builder.builders.WebsiteBuilder;
import ua.com.yehorchevardin.java.patterns.creational.builder.dto.Cms;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
  @Override
  public WebsiteBuilder buildPrice() {
    website.setPrice(100);
    return this;
  }

  @Override
  public WebsiteBuilder buildCms() {
    website.setCms(Cms.WORDPRESS);
    return this;
  }

  @Override
  public WebsiteBuilder buildName() {
    website.setName("Visit card");
    return this;
  }
}
