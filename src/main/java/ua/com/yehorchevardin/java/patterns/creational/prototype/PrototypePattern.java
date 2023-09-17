package ua.com.yehorchevardin.java.patterns.creational.prototype;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;

public class PrototypePattern implements PatternExplanation {
    @Override
    public void execute() {
        new VersionControlRunner().execute();
    }
}
