package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.dao.ForestDao;
import sti.abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDao {
/*
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:sti-abstractions-dao.xml");
    ForestDao forestDao = (ForestDao) context.getBean("forestDao");

    @Test
    public void testGetConnection() throws SQLException {
        Connection connection = forestDao.getConnection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void testCreateSquirrel(){
        Squirrel piff = forestDao.createSquirrel(10, "Özgür");
        Assert.assertNotNull(piff);
    }

 */
}
