package p8.Observer;

public class Test {
    public static void main(String[] args) {
        InterfSub sub1 = new Sub();
        InterfSub sub2 = new Sub();
        InterfSub sub3 = new Sub();

        InterfObserver obs = new Publisher();

        obs.attach(sub1);
        obs.attach(sub2);
        obs.attach(sub3);

        obs.notifySubs();

        obs.detach(sub2);

        obs.notifySubs();
    }
}