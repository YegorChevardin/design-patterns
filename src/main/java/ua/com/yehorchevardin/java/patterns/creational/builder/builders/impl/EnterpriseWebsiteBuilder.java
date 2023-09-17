package ua.com.yehorchevardin.java.patterns.creational.builder.builders.impl;

import ua.com.yehorchevardin.java.patterns.creational.builder.builders.WebsiteBuilder;
import ua.com.yehorchevardin.java.patterns.creational.builder.dto.Cms;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
  @Override
  public WebsiteBuilder buildPrice() {
    website.setPrice(10000);
    return this;
  }

  @Override
  public WebsiteBuilder buildCms() {
    website.setCms(Cms.MIMOSA);
    return this;
  }

  @Override
  public WebsiteBuilder buildName() {
    website.setName("Enterprise website");
    return this;
  }
}
