package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ForestDaoImpl implements ForestDao{

    Connection connection = null;
    Statement statement = null;

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sti", "root", "root");
    }

    @Override
    public Owl createOwl(int wingSpan) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(int age, String name) {
        return null;
    }

    @Override
    public PineTree createPineTree(int numOfPineCones) {
        return null;
    }

    @Override
    public Boolean killOwl(Owl owl) {
        return null;
    }
}
