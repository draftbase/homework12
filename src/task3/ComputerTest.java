
package task3;

public class ComputerTest {
    public static void main(String[] args) {
        try {
            Procesor procesor = new Procesor(3000, 40, 55
                    , "model1", "Intel", "EQWE78WQE0WQE0Q");
            RAM ram = new RAM(4096, 1066, 45, 60
                    , "model1", "Intel", "DSAIODON9U0");
            HardDrive hardDrive = new HardDrive(128, "model1", "Intel", "JODSAJ2");
            Computer computer = new Computer(procesor,hardDrive,ram);

            System.out.println(computer);
            procesor.upgrade(100);
            System.out.println(computer);
            procesor.upgrade(100);
        } catch (MaxPowerProcesorException ex){
            System.out.println("Za duża moc!!! " + ex.getMessage());
        }

    }
}
