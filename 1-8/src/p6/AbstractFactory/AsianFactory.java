package p6.AbstractFactory;

public class AsianFactory implements AbstractFactory{
    @Override
    public Man createMan() {
        return new AsianMan();
    }

    @Override
    public Woman createWoman() {
        return new AsianWoman();
    }
}
