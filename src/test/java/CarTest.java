
import org.junit.*;

import static org.junit.Assert.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception{
        c = new Car(15, 50);
    }

    @Test(timeout = 1000)
    public void TestGetMaxSpeed(){
        assertEquals(50, c.getMaxSpeed());
    }

    @Test(timeout = 1000)
    public void TestUpgradeSpeed(){
        c.upgradeSpeed();
        assertEquals(51, c.getMaxSpeed());
    }

    @Test(timeout = 1000)
    public void TestGetPrice(){
        assertEquals(15, c.getPrice());
    }
    @Test(timeout = 1000)
    public void TestDowngradeSpeed(){
        c.downgradeSpeed();
        assertEquals(49, c.getMaxSpeed());
    }




}
