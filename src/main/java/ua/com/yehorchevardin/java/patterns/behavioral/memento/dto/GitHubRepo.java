package ua.com.yehorchevardin.java.patterns.behavioral.memento.dto;

public class GitHubRepo {
  private Save save;

  public Save getSave() {
    return save;
  }

  public void setSave(Save save) {
    this.save = save;
  }
}
