package p6.Builder;

public class PC_Builder implements Builder{
    Computer pc = new Computer();

    @Override
    public void createGPU(String GPU) {
        pc.setGPU(GPU);
    }

    @Override
    public void createRAM(String RAM) {
        pc.setRAM(RAM);
    }

    @Override
    public void createMotherboard(String Motherboard) {
        pc.setMotherboard(Motherboard);
    }

    @Override
    public Computer getResult() {
        return pc;
    }
}
