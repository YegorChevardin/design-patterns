package ua.com.yehorchevardin.java.patterns.structural.composite;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.composite.dto.Project;

public class CompositePattern implements PatternExplanation {
    @Override
    public void execute() {
        Project project = new Project();
        project.build();
    }
}
