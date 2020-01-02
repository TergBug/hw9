package org.mycode.behavioral.command;

public class MovProcessorCommand implements Command {
    private Processor processor;
    private String operand1;
    private String operand2;
    public MovProcessorCommand(Processor processor, String operand1, String operand2) {
        this.processor = processor;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    @Override
    public void execute() {
        processor.mov(operand1, operand2);
    }
}
