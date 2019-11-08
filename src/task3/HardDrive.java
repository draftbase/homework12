package task3;

public class HardDrive extends Hardware{
    private int memory;

    public HardDrive(int memory, String model, String manufacturer, String serialNumber) {
        super(model, manufacturer, serialNumber);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "memory=" + memory +
                '}';
    }
}
