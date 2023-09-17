package ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.Expression;

public class TerminalExpression implements Expression {
  private String data;

  public TerminalExpression(String data) {
    this.data = data;
  }

  @Override
  public boolean interpret(String context) {
    return context.contains(data);
  }
}
