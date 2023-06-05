package p6.Fabric;

public class BlackCreator extends Factory{

    @Override
    protected Human createHuman() {
        return new BlackHuman();
    }
}
