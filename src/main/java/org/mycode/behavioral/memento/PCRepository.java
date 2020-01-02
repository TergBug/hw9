package org.mycode.behavioral.memento;

public class PCRepository {
    private Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}
