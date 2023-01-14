public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(double totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = totalCapacity;
        this.open = false;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void open() {
        if (open) {
            System.out.println("Bottle is already open");
        } else {
            open = true;
            System.out.println("Bottle is opened");
        }
    }

    public void close() {
        if (!open) {
            System.out.println("Bottle is already closed");
        } else {
            open = false;
            System.out.println("Bottle is closed");
        }
    }

    public void drink(double amount) {
        if (!open) {
            System.out.println("Cannot drink from a closed bottle");
            return;
        }
        if (amount > availableLiquid) {
            System.out.println("Not enough liquid in the bottle");
            return;
        }
        availableLiquid -= amount;
        System.out.println("Drank " + amount + " L of liquid");
    }
}