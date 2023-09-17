package ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto;

public interface Expression {
    boolean interpret(String context);
}
