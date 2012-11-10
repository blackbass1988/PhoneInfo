package unit;

import org.junit.Test;
import ru.salionov.phone.info.collector.BrandCollector;
import utils.UnitTest;

/**
 * @author blackbass <o.salionov@zmeke.com>
 */
public class BrandCollectorTest extends UnitTest{

    @Test
    public void test(){
        BrandCollector brandCollector = new BrandCollector();
        assertFalse(brandCollector.getBrandList().isEmpty());
    }
}
