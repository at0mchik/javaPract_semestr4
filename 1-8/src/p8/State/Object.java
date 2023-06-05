package p8.State;

public class Object {
    private StateAction curr = new FirstState();

    public void run(){
        curr.run();
    }

    public void stop(){
        curr.stop();
    }

    public void change(){
        curr = new SecondState();
    }
}
