package ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.interpreter.dto.Expression;

public class OrExpression implements Expression {
  private Expression expression1;
  private Expression expression2;

  public OrExpression(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  @Override
  public boolean interpret(String context) {
    return expression1.interpret(context) || expression2.interpret(context);
  }
}
