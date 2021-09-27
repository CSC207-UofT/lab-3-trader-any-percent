/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class BicycleTest {
    Bicycle b;

    @Before
    public void setUp() throws Exception {
        b = new Bicycle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(11, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(0, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(500, b.getPrice());
    }

}