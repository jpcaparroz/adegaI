package dao;

import bd.ConnectBd;
import model.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProdutoDAO {
    
    Connection connection;
    
    public ProdutoDAO() throws SQLException {
        
        connection = ConnectBd.getConnection();
    }
    
    //INSERE PRODUTO
    public boolean insertProduto (Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (nome, valor, quantidade, tipo) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, produto.getNome());
        statement.setDouble(2, produto.getValor());
        statement.setInt(3, produto.getQuantidade());
        statement.setString(4, produto.getTipo());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    //EXCLUI PRODUTO
    public boolean deletProduto(String nome) throws SQLException {
        String sql = "DELETE FROM produto WHERE nome=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);

        int rowsDeleted = statement.executeUpdate();

        return rowsDeleted > 0;
    }
    
    //INSERE QUANTIDADE PRODUTO
    public boolean balancoQuantidadeProduto (Produto produto) throws SQLException {
        String sql = "UPDATE produto SET quantidade=? WHERE nome=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, produto.getQuantidade());
        statement.setString(2, produto.getNome());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    //RETORNA QUANTIDADE DE PRODUTOS
    public int quantidadeProduto () throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM produto";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet result = statement.executeQuery();
        result.next();
        int count = result.getInt("total");
        return count;
    }


    public void close() throws SQLException{
        connection.close();
    }
    
}
