package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import sti.abstractions.domain.Owl;

public class OwlUnitTest {

    private static final int EXPECTED_WINGSPAN = 90;

    @Test
    public void testOwlWingSpan(){
        Owl owl = new Owl(-10);
        Assert.assertEquals(EXPECTED_WINGSPAN, owl.getWingSpan());
    }

}
