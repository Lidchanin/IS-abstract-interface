public abstract class MachinesAbstract {
    private double weight;
    private double speed;
    private double mileage;

    public double getWeight() {
        return weight;
    }
    public double getSpeed() {
        return speed;
    }
    public double getMileage() {
        return mileage;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public abstract void repair();
    public abstract void passengerLoading();
}
