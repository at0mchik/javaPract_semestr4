package p8.State;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();

        obj.run();
        obj.stop();

        obj.change();

        obj.run();
        obj.stop();
    }
}
