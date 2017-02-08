public class Machines implements IMachines {

    private double weight;
    private double speed;
    private double mileage;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getMileage() {
        return mileage;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public void repair() {
        System.out.println("Do repairing ");
    }

    @Override
    public void passengerLoading() {
        System.out.println("Loading passenger ");
    }
}
