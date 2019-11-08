package task3;

public class RAM extends Hardware {
    private int memory;
    private int MHz;
    private int normalWorkingTemperature;
    private int maxWorkingTemperature;

    public RAM(int memory, int MHz, int normalWorkingTemperature, int maxWorkingTemperature,
            String model, String manufacturer, String serialNumber) {
        super(model, manufacturer, serialNumber);
        this.memory = memory;
        this.MHz = MHz;
        this.normalWorkingTemperature = normalWorkingTemperature;
        this.maxWorkingTemperature = maxWorkingTemperature;
    }

    public int getMemory() {
        return memory;
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

    public void upgrade(int addMHz) throws MaxPowerRAMException {
        checkMaxPowerRAMException(addMHz);
        memory += addMHz;
        normalWorkingTemperature += addMHz/100*15;
    }
    private void checkMaxPowerRAMException(int addMHz) throws MaxPowerRAMException {
        if(addMHz + memory > maxWorkingTemperature){
            throw new MaxPowerRAMException();
        }
    }

    @Override
    public String toString() {
        return "RAM{" +
                "memory=" + memory +
                ", MHz=" + MHz +
                ", normalWorkingTemperature=" + normalWorkingTemperature +
                ", maxWorkingTemperature=" + maxWorkingTemperature +
                '}';
    }
}
