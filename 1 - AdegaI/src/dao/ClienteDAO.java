package dao;

import bd.ConnectBd;
import model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ClienteDAO {
    
    Connection connection;
    
    public ClienteDAO() throws SQLException{

        connection = ConnectBd.getConnection();
    }
    
    public boolean insertCliente (Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cliente.getNome());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    public void close() throws SQLException {
        connection.close();
    }
}
