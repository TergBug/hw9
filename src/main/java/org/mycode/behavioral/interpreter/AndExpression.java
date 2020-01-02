package org.mycode.behavioral.interpreter;

public class AndExpression implements Expression {
    private Expression[] expressions;
    public AndExpression(Expression... expressions) {
        this.expressions = expressions;
    }
    @Override
    public boolean interpret(String context) {
        for (Expression expression : expressions) {
            if(!expression.interpret(context)) {
                return false;
            }
        }
        return true;
    }
}
