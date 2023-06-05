package p6.AbstractFactory;

public class BlackFactory implements AbstractFactory{
    @Override
    public Man createMan() {
        return new BlackMan();
    }

    @Override
    public Woman createWoman() {
        return new BlackWoman();
    }
}
