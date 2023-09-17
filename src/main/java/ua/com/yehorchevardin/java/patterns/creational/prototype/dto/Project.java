package ua.com.yehorchevardin.java.patterns.creational.prototype.dto;

public class Project implements Copyable {
  private String projectName;
  private int id;
  private String sourceCode;

  public Project(String projectName, int id, String sourceCode) {
    this.projectName = projectName;
    this.id = id;
    this.sourceCode = sourceCode;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
  }

  @Override
  public Object copy() {
    return new Project(projectName, id, sourceCode);
  }
}
