package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.dao.ForestDao;

public class TestDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:sti-abstractions-dao.xml");

    @Test
    public void testGetBean(){
        ForestDao forestDao = (ForestDao) context.getBean("forestDao");
        Assert.assertNotNull(forestDao);
    }

}
