package ua.com.yehorchevardin.java.patterns.structural.facade;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.facade.dto.SpringRunner;

public class FacadePattern implements PatternExplanation {
    @Override
    public void execute() {
        SpringRunner springRunner = new SpringRunner();
        springRunner.execute();
    }
}
