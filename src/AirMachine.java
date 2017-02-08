public class AirMachine extends MachinesAbstract implements IAirMachine{

    private int numberWing;
    private double timeStart;
    private int numberPlane;

    public AirMachine(int numberWing, double timeStart, int numberPlane) {
        this.numberWing = numberWing;
        this.timeStart = timeStart;
        this.numberPlane = numberPlane;
    }

    @Override
    public int getNumberWing() {
        return numberWing;
    }

    @Override
    public double getTimeStart() {
        return timeStart;
    }

    @Override
    public int getNumberPlane() {
        return numberPlane;
    }

    @Override
    public void start() {
        System.out.println("Go fly");
    }

    @Override
    public void openChassis() {
        System.out.println("Open chassis");
    }

    @Override
    public void repair() {
        System.out.println("Repairing plane");
    }

    @Override
    public void passengerLoading() {
        System.out.println("plane loading");
    }
}
