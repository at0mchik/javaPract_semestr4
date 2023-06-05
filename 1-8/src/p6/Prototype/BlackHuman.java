package p6.Prototype;

public class BlackHuman extends Human{

    public BlackHuman(){
        this.Color = "black";
    }

    @Override
    void addHuman() {
        System.out.println("Black human added");
    }
}
