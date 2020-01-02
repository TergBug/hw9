package org.mycode.behavioral.interpreter;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Greeting greeting = new Greeting("Joey");
        Scanner scanner = new Scanner(System.in);
        checkGreeting(greeting.getExpression(), scanner.nextLine());
    }
    private static void checkGreeting(Expression greeting, String text){
        if(greeting.interpret(text)){
            System.out.println("Good greeting");
        } else {
            System.out.println("Wrong greeting");
        }
    }
}
