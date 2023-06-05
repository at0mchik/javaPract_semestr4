package p8.State;

public class SecondState implements StateAction{
    @Override
    public void run() {
        System.out.println("2nd run");
    }

    @Override
    public void stop() {
        System.out.println("2nd stop");
    }
}