package sti.abstractions.dao;

import sti.abstractions.domain.Owl;
import sti.abstractions.domain.PineTree;
import sti.abstractions.domain.Squirrel;

import java.sql.*;

public class ForestDaoImpl implements ForestDao {

    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    int result = 0;

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sti", "root", "root");
    }

    @Override
    public Owl createOwl(int wingSpan) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(int age, String name)  {

        try{
            conn = getConnection();
            stat =conn.prepareStatement("INSERT INTO squirrel ( age, name, source) VALUES(3, 'Piff', 'fredag')");
            result = stat.executeUpdate("INSERT INTO squirrel ( age, name, source) VALUES(3, 'Piff', 'fredag')");
        }catch (SQLException e){
            System.out.println(e);
        }
        return new Squirrel(age, name);
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
