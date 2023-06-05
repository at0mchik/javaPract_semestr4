package p7.Proxy;

public class RealObject implements Service{
    @Override
    public String operation(String data) {
        return "Real obj worked";
    }
}
