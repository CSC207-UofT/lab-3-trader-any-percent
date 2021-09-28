public class Cow implements Drivable, Domesticatable, Tradable{
    /**
     * A class for cow which is drivable, tradable, and domesticatable.
     */
    private int maxSpeed;
    public Cow() {this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "MOO, MOO!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        if (this.maxSpeed > 0){
            this.maxSpeed --;
        }
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}

