package utils;

import junit.framework.Assert;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import ru.salionov.phone.info.support.Configuration;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class UnitTest {

    @BeforeClass
    public static void prepareLog4j() {
        String logFile = Configuration.getProperty("log4j.path", "log4j.properties");
        PropertyConfigurator.configure(Configuration.CONF_BASE_DIR + logFile);
    }

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
