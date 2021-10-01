

public class Train implements Tradable,Drivable {
    private int maxSpeed;
    private final int price;

    public Train() {
        this.maxSpeed = 50;
        this.price = 5000000;
    }

    public Train(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.price = 5000000;
    }

    public Train(int maxSpeed, int price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
