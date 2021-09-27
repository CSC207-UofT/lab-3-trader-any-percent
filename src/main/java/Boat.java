
public class Boat implements Tradable, Drivable {
    private int maxSpeed;

    public Boat(){
        this.maxSpeed = 10;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        if (this.maxSpeed >= 0){
            this.maxSpeed -= 2;
        }
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
