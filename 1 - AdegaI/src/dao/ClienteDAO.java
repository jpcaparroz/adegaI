package dao;

import bd.ConnectBd;
import model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
    Connection connection;
    
    public ClienteDAO() throws SQLException{

        connection = ConnectBd.getConnection();
    }
    
    //INSERE CLIENTE
    public boolean insertCliente (Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cliente.getNome());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    //VERIFICA CLIENTE
    public Cliente verifyCliente() throws SQLException {
        
        String sql = "SELECT * FROM cliente";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();
        
        result.next();
        Cliente cliente = new Cliente(result.getInt(1), result.getString(2));
        
        return cliente;
    }
    
    //RETORNA QUANTIDADE DE CLIENTES
    public int quantidadeCliente () throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet result = statement.executeQuery();
        result.next();
        int count = result.getInt("total");
        return count;
    }
    
    public void close() throws SQLException {
        connection.close();
    }
}
