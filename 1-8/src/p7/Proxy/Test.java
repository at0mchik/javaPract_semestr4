package p7.Proxy;

public class Test {
    public static void main(String[] args) {
        Service sev = new Proxy();
        System.out.println(sev.operation("aafs"));
        System.out.println(sev.operation("For proxy: aafs"));
    }
}
