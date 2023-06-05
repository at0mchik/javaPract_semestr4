package p8.Observer;

public interface InterfObserver {
    public void attach(InterfSub sub);
    public void detach(InterfSub sub);

    public void notifySubs();
}
