public class Main {

    public static void main(String[] args) {

        GroundMachine bus1 = new GroundMachine(17, 6, true);
        WaterMachine ship1 = new WaterMachine(100, false, "Ivanov");
        AirMachine plane1 = new AirMachine(4,100.5,19856);

        plane1.repair();
        ship1.repair();
        bus1.repair();

    }
}
