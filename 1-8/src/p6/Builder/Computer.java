package p6.Builder;

public class Computer {
    private String GPU;
    private String RAM;
    private String Motherboard;

    public String getGPU() {
        return GPU;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setMotherboard(String motherboard) {
        Motherboard = motherboard;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Motherboard='" + Motherboard;
    }
}
