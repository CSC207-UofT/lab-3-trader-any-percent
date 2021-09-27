import org.junit.*;

import static org.junit.Assert.*;

public class CowTest {
    Cow h;

    @Before
    public void setUp() throws Exception{
        h = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("MOO, MOO!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(11, h.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1500, h.getPrice());
    }
}
