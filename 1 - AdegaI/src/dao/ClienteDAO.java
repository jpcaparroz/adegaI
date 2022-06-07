package dao;

import bd.ConnectBd;
import model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class ClienteDAO {
    
    Connection connection;
    
    public ClienteDAO() throws SQLException{

        connection = ConnectBd.getConnection();
    }
    
    //BUSCA CLIENTE
    public void buscarClientes (JComboBox combo) throws SQLException {
        String sql = "SELECT * FROM cliente";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();
            
        while (result.next()){
            
        String cliente = (result.getInt(1) + " |Nome: " +result.getString(2));

        combo.addItem(cliente);
        }
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
    
    //EXCLUI CLIENTE
    public boolean deletCliente(int id) throws SQLException {
        String sql = "DELETE FROM cliente WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        int rowsDeleted = statement.executeUpdate();

        return rowsDeleted > 0;
    }
    
    public void close() throws SQLException {
        connection.close();
    }
}
