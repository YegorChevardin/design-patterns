package ua.com.yehorchevardin.java.patterns.behavioral.interpreter;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.Expression;
import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.impl.AndExpression;
import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.impl.OrExpression;
import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.impl.TerminalExpression;

public class InterpreterPattern implements PatternExplanation {
  @Override
  public void execute() {
    Expression isJava = getJavaExpression();
    Expression isJavaEE = getJavaEEExpression();

    System.out.println("Developer knows java core: " + isJava.interpret("Java"));
    System.out.println("Developer knows java ee: " + isJavaEE.interpret("JavaEE Spring"));
  }

  private static Expression getJavaExpression() {
    Expression javaExpression = new TerminalExpression("Java");
    Expression javaCoreExpression = new TerminalExpression("Java Core");
    return new OrExpression(javaExpression, javaCoreExpression);
  }

  private static Expression getJavaEEExpression() {
    Expression javaEEExpression = new TerminalExpression("JavaEE");
    Expression springExpression = new TerminalExpression("Spring");
    return new AndExpression(javaEEExpression, springExpression);
  }
}
