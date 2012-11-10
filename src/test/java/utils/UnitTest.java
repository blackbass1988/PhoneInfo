package utils;

import junit.framework.Assert;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class UnitTest {
    public static void assertEquals(Object x, Object y) {
        Assert.assertEquals(x, y);
    }

    public static void assertEquals(boolean x, boolean y) {
        Assert.assertEquals(x, y);
    }

    public static void assertEquals(int x, int y) {
        Assert.assertEquals(x, y);
    }

    public static void assertEquals(float x, float y) {
        Assert.assertEquals(x, y);
    }
    public static void assertEquals(double x, double y) {
        Assert.assertEquals(x, y);
    }

    public static void assertEquals(byte x, byte y) {
        Assert.assertEquals(x, y);
    }

    public static void assertNotNull(Object o){
        Assert.assertNotNull(o);
    }

    public static void assertNull(Object o){
        Assert.assertNull(o);
    }

    public static void assertTrue(Boolean o){
        Assert.assertTrue(o);
    }

    public static void assertFalse(Boolean o){
        Assert.assertFalse(o);
    }



}
