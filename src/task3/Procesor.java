package task3;

public class Procesor {
    private int processor;
    private int normalWorkingTemperature;
    private int maxWorkingTemperature;

    public Procesor(int processor, int normalWorkingTemperature, int maxWorkingTemperature) {
        this.processor = processor;
        this.normalWorkingTemperature = normalWorkingTemperature;
        this.maxWorkingTemperature = maxWorkingTemperature;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
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
