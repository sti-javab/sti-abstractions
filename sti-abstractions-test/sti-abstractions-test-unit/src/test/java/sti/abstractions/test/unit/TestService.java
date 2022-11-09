package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.domain.Owl;
import sti.abstractions.domain.Squirrel;
import sti.abstractions.service.ForestService;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-abstractions-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        forestService = (ForestService)applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependecyInjection(){
        Owl owl = forestService.createOwl(95);
        Assert.assertNotNull(owl);
    }

    /*
    @Test
    public void testCreateSquirrel(){
        Squirrel squirrel= forestService.createSquirrel(3, "Rafi");
        Assert.assertEquals(3, squirrel.getWeight());
    }
*/
}
