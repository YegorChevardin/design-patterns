package ua.com.yehorchevardin.java.patterns.behavioral.iterator.dto;

public class JavaDeveloper implements Collection<String> {
  private String name;
  private String[] skills;

  public JavaDeveloper(String name, String[] skills) {
    this.name = name;
    this.skills = skills;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }

  public String getName() {
    return name;
  }

  public String[] getSkills() {
    return skills;
  }

  @Override
  public Iterator<String> getIterator() {
    return new Iterator<>() {
      private int currentIndex = 0;

      @Override
      public boolean hasNext() {
        return currentIndex < skills.length;
      }

      @Override
      public String next() {
        return skills[currentIndex++];
      }
    };
  }
}
