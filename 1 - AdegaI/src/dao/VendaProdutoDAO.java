package dao;

import bd.ConnectBd;
import model.VendaProduto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class VendaProdutoDAO {
    
    Connection connection;
    
    public VendaProdutoDAO() throws SQLException {
        
        connection = ConnectBd.getConnection();
    }
    
    //INSERE VENDA
    public boolean insertProdutoVenda (VendaProduto vendaProduto) throws SQLException {
        String sql = "INSERT INTO venda_produto (id_venda, id_produto, quantidade) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, vendaProduto.getId_venda());
        statement.setInt(2, vendaProduto.getId_produto());
        statement.setInt(3, vendaProduto.getQuantidade());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }

    public void close() throws SQLException{
        connection.close();
    }
    
}
