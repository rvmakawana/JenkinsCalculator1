import org.junit.Test;
import org.ravi.JenkinsCalculator;

import static org.junit.Assert.assertEquals;

public class JenkinsCalculatorTest {

    JenkinsCalculator jenkinsCalculator = new JenkinsCalculator();
    @Test
    public void firstTest()
    {
        assertEquals(10,jenkinsCalculator.addnumbers(3,7));
    }

    @Test
    public void secondTest()
    {
        assertEquals(10,jenkinsCalculator.subnumbers(17,7));
    }

}
