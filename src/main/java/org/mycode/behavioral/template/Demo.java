package org.mycode.behavioral.template;

public class Demo {
    public static void main(String[] args) {
        Human chinese = new Chinese();
        Human ukrainian = new Ukrainian();
        chinese.showInfo();
        System.out.println("\n==================\n");
        ukrainian.showInfo();
    }
}
