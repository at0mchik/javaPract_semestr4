package p6.Builder;

public class Test {
    public static void main(String[] args){
        MyPC pc = new MyPC();
        PC_Builder builder = new PC_Builder();
        pc.createMyPC(builder);
        System.out.println(builder.getResult());
    }
}
