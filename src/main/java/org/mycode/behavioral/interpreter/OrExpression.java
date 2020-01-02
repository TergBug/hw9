package org.mycode.behavioral.interpreter;

public class OrExpression implements Expression {
    private Expression[] expressions;
    public OrExpression(Expression... expressions) {
        this.expressions = expressions;
    }
    @Override
    public boolean interpret(String context) {
        for (Expression expression : expressions) {
            if(expression.interpret(context)) {
                return true;
            }
        }
        return false;
    }
}
