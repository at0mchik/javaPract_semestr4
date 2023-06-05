package p8.State;

public class FirstState implements StateAction{
    @Override
    public void run() {
        System.out.println("1st run");
    }

    @Override
    public void stop() {
        System.out.println("1st stop");
    }
}
