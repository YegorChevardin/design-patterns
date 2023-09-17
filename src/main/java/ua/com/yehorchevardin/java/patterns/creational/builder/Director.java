package ua.com.yehorchevardin.java.patterns.creational.builder;

import ua.com.yehorchevardin.java.patterns.creational.builder.builders.WebsiteBuilder;
import ua.com.yehorchevardin.java.patterns.creational.builder.dto.Website;

public class Director {
  private WebsiteBuilder builder;

  public void setBuilder(WebsiteBuilder builder) {
    this.builder = builder;
  }

  Website buildWebsite() {
    return builder.createWebsite().buildName().buildPrice().buildCms().getWebsite();
  }
}
