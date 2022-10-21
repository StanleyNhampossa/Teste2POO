package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConexao(){
        Connection connection = null;

        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            String url = "jdbc:mysql://localhost:3306/teste2poo";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;

    }
}
