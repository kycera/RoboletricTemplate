package cz.orgon.marek.roboletrictemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

/**
 * Created by kycer_000 on 14. 2. 2015 at RoboletricTemplate.
 */
@Config(manifest = Config.NONE)
@RunWith(RobolectricTestRunner.class)

public class FooBigTests {
    @Test
    public void fooTest() {
        assertTrue(true);
    }

    @Test
    public void fooTest2() {
        assertTrue(true);
    }

    @Test
    public void fooTest3() {
        assertTrue(true);
    }
}
