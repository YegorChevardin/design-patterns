package ua.com.yehorchevardin.java.patterns.structural.proxy.dto.impl;

import ua.com.yehorchevardin.java.patterns.structural.proxy.dto.Project;

public class RealProject implements Project {
  private final String url;

  public RealProject(String url) {
    this.url = url;
    load();
  }

  public void load() {
    System.out.println("Loading project from " + url + "...");
  }

  @Override
  public void run() {
    System.out.println("Real project is running on " + url + "!");
  }
}
