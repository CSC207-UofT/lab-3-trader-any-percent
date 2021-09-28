import org.junit.*;

import static org.junit.Assert.*;

public class BoatTest {
    Boat b;

    @Before
    public void setUp() throws Exception {
        b = new Boat();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(12, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(8, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(500, b.getPrice());
    }
}
