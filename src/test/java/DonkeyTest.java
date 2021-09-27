import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DonkeyTest {
    Donkey d;

    @Before
    public void setUp() throws Exception {
        d = new Donkey();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("HEE HAW", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, d.getPrice());
    }
}
