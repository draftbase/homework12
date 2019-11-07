package task3;

public class RAM {
    private int memory;
    private int MHz;
    private int normalWorkingTemperature;
    private int maxWorkingTemperature;

    public RAM(int memory, int MHz, int normalWorkingTemperature, int maxWorkingTemperature) {
        this.memory = memory;
        this.MHz = MHz;
        this.normalWorkingTemperature = normalWorkingTemperature;
        this.maxWorkingTemperature = maxWorkingTemperature;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMHz() {
        return MHz;
    }

    public void setMHz(int MHz) {
        this.MHz = MHz;
    }

    public int getNormalWorkingTemperature() {
        return normalWorkingTemperature;
    }

    public void setNormalWorkingTemperature(int normalWorkingTemperature) {
        this.normalWorkingTemperature = normalWorkingTemperature;
    }

    public int getMaxWorkingTemperature() {
        return maxWorkingTemperature;
    }

    public void setMaxWorkingTemperature(int maxWorkingTemperature) {
        this.maxWorkingTemperature = maxWorkingTemperature;
    }
}
