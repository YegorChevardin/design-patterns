package ua.com.yehorchevardin.java.patterns.structural.proxy.dto;

import ua.com.yehorchevardin.java.patterns.structural.proxy.dto.impl.RealProject;

public class ProxyProject implements Project {
  private String url;
  private RealProject realProject;

  public ProxyProject(String url) {
    this.url = url;
  }

  @Override
  public void run() {
    if (realProject == null) {
      realProject = new RealProject(url);
    }
    realProject.run();
  }
}
