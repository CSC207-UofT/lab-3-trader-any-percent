
import org.junit.*;

import static org.junit.Assert.*;

public class TrainTest {

    Train t1, t2, t3;

    @Before
    public void setUp() throws Exception {
        t1 = new Train();
        t2 = new Train(100);
        t3 = new Train(500, 12345678);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(50, t1.getMaxSpeed());
        assertEquals(100, t2.getMaxSpeed());
        assertEquals(500, t3.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t1.upgradeSpeed();
        assertEquals(51, t1.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5000000, t1.getPrice());
        assertEquals(12345678, t3.getPrice());
    }

}
