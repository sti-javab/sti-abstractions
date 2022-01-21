package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import sti.abstractions.domain.Owl;

public class TestOwl {

    private static final String INPUT_1 = "True";



    @Test
    public void olwConstructorTest(){
        Owl owl = new Owl(-10);
        Assert.assertEquals(90, owl.getWingSpan());
        Assert.assertNotEquals(-10, owl.getWingSpan());
    }

}
