public class Bicycle implements Tradable, Drivable{
    private int maxSpeed;
    private final int price;
    public Bicycle(){
        maxSpeed = 10;
        price = 500;
    }
    @Override
    public void upgradeSpeed() {
        maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
