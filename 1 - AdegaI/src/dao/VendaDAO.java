package dao;

import bd.ConnectBd;
import model.Venda;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class VendaDAO {
    
    Connection connection;
    
    public VendaDAO() throws SQLException {
        
        connection = ConnectBd.getConnection();
    }
    
    //INSERE VENDA
    public boolean insertVenda (Venda venda) throws SQLException {
        String sql = "INSERT INTO venda (data, valor, id_cliente, id_funcionario) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, venda.getData());
        statement.setDouble(2, venda.getValor());
        statement.setInt(3, venda.getId_cliente());
        statement.setInt(4, venda.getId_funcionario());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    public int ultimaVenda() throws SQLException {
        String sql = "SELECT id FROM venda ORDER BY  id DESC LIMIT 1";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet result = statement.executeQuery();
        
        result.next();
        
        return result.getInt(1);
    }

    public void close() throws SQLException{
        connection.close();
    }
    
}
