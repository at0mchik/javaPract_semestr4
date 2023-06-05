package p6.Fabric;

public class AsianCreator extends Factory{
    @Override
    protected Human createHuman() {
        return new AsianHuman();
    }
}
