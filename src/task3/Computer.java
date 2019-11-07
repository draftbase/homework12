package task3;

public class Computer {
    private Procesor procesor;
    private HardDrive hardDrive;
    private RAM ram;

    public Computer(Procesor procesor, HardDrive hardDrive, RAM ram) {
        this.procesor = procesor;
        this.hardDrive = hardDrive;
        this.ram = ram;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
