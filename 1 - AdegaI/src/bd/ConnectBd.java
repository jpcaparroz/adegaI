package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBd {
    
    static String urlBD = "jdbc:mysql://localhost:3306/testes_adegai"; //url do banco de dados
    static String username = "root"; //login do banco de dados
    static String password = "root"; //senha do banco de dados

    public static Connection getConnection() throws SQLException{
        Connection connection = null;

        connection = DriverManager.getConnection(urlBD, username, password);
        
        return connection;
    }
}
