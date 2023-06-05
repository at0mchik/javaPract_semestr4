package p8.Observer;

import java.util.ArrayList;

public class Publisher implements InterfObserver{
    private ArrayList<InterfSub> subs = new ArrayList<>();

    @Override
    public void attach(InterfSub sub) {
        subs.add(sub);
    }

    @Override
    public void detach(InterfSub sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySubs() {
        subs.forEach(InterfSub::update);
    }
}
