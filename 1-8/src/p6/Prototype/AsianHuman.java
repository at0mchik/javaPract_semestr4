package p6.Prototype;

public class AsianHuman extends Human{

    public AsianHuman(){
        this.Color = "asian";
    }

    @Override
    void addHuman() {
        System.out.println("Asian human added");
    }
}
