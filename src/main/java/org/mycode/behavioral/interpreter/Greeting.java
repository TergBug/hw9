package org.mycode.behavioral.interpreter;

public class Greeting {
    private Expression expression;
    public Greeting(String receiver) {
        System.out.println("Greet "+receiver+"!!");
        expression = new AndExpression(
                new OrExpression(
                        new TerminalExpression("Hello"),
                        new TerminalExpression("Hi"),
                        new TerminalExpression("Good morning"),
                        new TerminalExpression("Good evening")
                ),
                new TerminalExpression(receiver)
        );
    }
    public Expression getExpression() {
        return expression;
    }
}
