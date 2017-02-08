public class WaterMachine extends MachinesAbstract implements IWaterMachine{

    private double deckWidth;
    private boolean avaibleSails;
    private String nameShip;

    public WaterMachine (double deckWidth, boolean avaibleSails, String nameShip) {
        this.deckWidth = deckWidth;
        this.avaibleSails = avaibleSails;
        this.nameShip = nameShip;
    }

    @Override
    public double getDeckWidth() {
        return deckWidth;
    }

    @Override
    public boolean getAvaibleSails() {
        return avaibleSails;
    }

    @Override
    public String getNameShip() {
        return nameShip;
    }

    @Override
    public void goSwim() {
        System.out.println("U r swimming");
    }

    @Override
    public void crashIntoIceberg() {
        System.out.println("U r Titanic");
    }

    @Override
    public void repair() {
        System.out.println("Repairing ship");

    }

    @Override
    public void passengerLoading() {
        System.out.println("ship loading");
    }
}
