package p6.Builder;

public interface Builder {
    void createGPU(String GPU);
    void createRAM(String RAM);
    void createMotherboard(String Motherboard);
    Computer getResult();
}
