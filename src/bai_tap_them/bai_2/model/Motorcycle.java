package bai_tap_them.bai_2.model;

public class Motorcycle extends Transport {
    private double wattage;

    @Override
    public String getInfo() {
        return String.format("%s,%s", super.toString(), wattage);
    }

    public Motorcycle() {
    }

    public Motorcycle(double wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String seaOf​Control, Manufacturer manufacturer, String yearOfManufacture, String owner, double wattage) {
        super(seaOf​Control, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage=" + wattage +
                "} " + super.toString();
    }
}
