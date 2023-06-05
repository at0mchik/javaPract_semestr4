package p6.Builder;

public class MyPC {
    public void createMyPC(Builder builder){
        builder.createGPU("GTX 1070ti");
        builder.createRAM("Kingston 16gb");
        builder.createMotherboard("Gigabyte X570S UD");
    }
}
