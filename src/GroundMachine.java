public class GroundMachine extends MachinesAbstract implements IGroundMachine{

    private double diskDiameter;
    private int numberDoor;
    private boolean mechanic;

    public GroundMachine(double diskDiameter, int numberDoor, boolean mechanic) {
        this.diskDiameter = diskDiameter;
        this.numberDoor = numberDoor;
        this.mechanic = mechanic;
    }

    @Override
    public double getDiskDiameter() {
        return diskDiameter;
    }

    @Override
    public int getNumberDoor() {
        return numberDoor;
    }

    @Override
    public boolean getMechanic() {
        return mechanic;
    }

    @Override
    public void doDrift() {
        System.out.println("Drifting");
    }

    @Override
    public void doRoofOff() {
        System.out.println("Ypu feel breeze");
    }

    @Override
    public void repair() {
        System.out.println("Repairing car");
    }

    @Override
    public void passengerLoading() {
        System.out.println("car loading");
    }
}
