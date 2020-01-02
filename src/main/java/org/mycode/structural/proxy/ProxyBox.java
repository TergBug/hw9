package org.mycode.structural.proxy;

public class ProxyBox implements Box{
    private static final String VALID_PASSWORD = "12345qwerty";
    private String password;
    private RealBox realBox;
    public ProxyBox(String password) {
        this.realBox = new RealBox();
        this.password = password;
    }
    @Override
    public void openBox(){
        if(password.equals(VALID_PASSWORD)){
            realBox.openBox();
        }else {
            System.out.println("Invalid password");
        }
    }
    @Override
    public void closeBox(){
        if(password.equals(VALID_PASSWORD)){
            realBox.closeBox();
        }else {
            System.out.println("Invalid password");
        }
    }
    @Override
    public void pushObject(String nameOfObject) {
        realBox.pushObject(nameOfObject);
    }
    @Override
    public String pullObject() {
        return realBox.pullObject();
    }
}
