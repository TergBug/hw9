package org.mycode.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Processor processor = new Processor();
        AssemblerDeveloper assemblerDeveloper = new AssemblerDeveloper(
                new MovProcessorCommand(processor, "RA", "RB"),
                new MviProcessorCommand(processor, "RA", 5),
                new AddProcessorCommand(processor, "RA", "RB")
        );
        assemblerDeveloper.mviCommand();
        assemblerDeveloper.movCommand();
        assemblerDeveloper.addCommand();
    }
}
