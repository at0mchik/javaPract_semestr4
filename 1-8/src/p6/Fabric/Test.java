package p6.Fabric;

public class Test {
    public static void main(String[] args) {
        Factory black = new BlackCreator();
        Factory asian = new AsianCreator();

        black.say();
        asian.say();
    }
}
