public class Car implements Drivable, Tradable {

    private int maxSpeed;
    private final int price;

    public Car(int price, int maxSpeed){

        this.price = price;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void upgradeSpeed() {

        this.maxSpeed ++;
    }

    @Override
    public void downgradeSpeed() {

        this.maxSpeed --;
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
