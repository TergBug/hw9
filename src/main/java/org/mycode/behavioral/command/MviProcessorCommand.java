package org.mycode.behavioral.command;

public class MviProcessorCommand implements Command {
    private Processor processor;
    private String operand1;
    private int operand2;
    public MviProcessorCommand(Processor processor, String operand1, int operand2) {
        this.processor = processor;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    @Override
    public void execute() {
        processor.mvi(operand1, operand2);
    }
}
