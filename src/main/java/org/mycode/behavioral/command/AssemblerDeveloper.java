package org.mycode.behavioral.command;

public class AssemblerDeveloper {
    private Command mov;
    private Command mvi;
    private Command add;
    public AssemblerDeveloper(Command mov, Command mvi, Command add) {
        this.mov = mov;
        this.mvi = mvi;
        this.add = add;
    }
    public void movCommand() {
        mov.execute();
    }
    public void mviCommand() {
        mvi.execute();
    }
    public void addCommand() {
        add.execute();
    }
}
