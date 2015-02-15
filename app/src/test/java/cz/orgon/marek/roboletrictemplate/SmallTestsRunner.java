package cz.orgon.marek.roboletrictemplate;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

/**
 * Created by kycer_000 on 15. 2. 2015 at RoboletricTemplate.
 */
@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters({".*SmallTests"})
public class SmallTestsRunner {
}
