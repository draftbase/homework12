package task3;

public class Procesor extends Hardware {
    private int processor;
    private int normalWorkingTemperature;
    private int maxWorkingTemperature;

    public Procesor(int processor, int normalWorkingTemperature, int maxWorkingTemperature,
                    String model, String manufacturer, String serialNumber) {
        super(model, manufacturer, serialNumber);
        this.processor = processor;
        this.normalWorkingTemperature = normalWorkingTemperature;
        this.maxWorkingTemperature = maxWorkingTemperature;
    }

    public int getProcessor() {
        return processor;
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

    public void upgrade(int addMHz) throws MaxPowerProcesorException {
        checkMaxPowerProcesorException(addMHz);
        processor += addMHz;
        normalWorkingTemperature += addMHz/10;
    }

    private void checkMaxPowerProcesorException(int addMHz) throws MaxPowerProcesorException {
        if(addMHz/10 + normalWorkingTemperature > maxWorkingTemperature){
            throw new MaxPowerProcesorException();
        }
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "processor=" + processor +
                ", normalWorkingTemperature=" + normalWorkingTemperature +
                ", maxWorkingTemperature=" + maxWorkingTemperature +
                '}';
    }
}
