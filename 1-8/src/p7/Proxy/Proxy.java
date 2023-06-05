package p7.Proxy;

public class Proxy implements Service{

    private RealObject obj;

    @Override
    public String operation(String data) {
        if (data.contains("For proxy")){
            return "Proxy worked";
        }
        else{
            obj = new RealObject();
            return obj.operation(data);
        }
    }
}
