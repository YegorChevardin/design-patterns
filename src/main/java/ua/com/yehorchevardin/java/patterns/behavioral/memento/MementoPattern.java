package ua.com.yehorchevardin.java.patterns.behavioral.memento;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.memento.dto.GitHubRepo;
import ua.com.yehorchevardin.java.patterns.behavioral.memento.dto.Project;

public class MementoPattern implements PatternExplanation {
  @Override
  public void execute() {
    GitHubRepo gitHubRepo = new GitHubRepo();

    Project project = new Project();
    project.setVersionAndDate("0.0.1");

    System.out.println(project);

    gitHubRepo.setSave(project.save());

    project.load(gitHubRepo.getSave());

    System.out.println(project);
  }
}
