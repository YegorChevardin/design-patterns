package ua.com.yehorchevardin.java.patterns.structural.proxy.dto;

public class ProjectRunner {
  public void run() {
    Project project = new ProxyProject("https://google.com");
    System.out.println("Code here before running and before loading hehe!");
    project.run();
  }
}
