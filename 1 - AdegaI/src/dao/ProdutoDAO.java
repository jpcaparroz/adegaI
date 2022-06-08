package dao;

import bd.ConnectBd;
import model.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class ProdutoDAO {
    
    Connection connection;
    
    public ProdutoDAO() throws SQLException {
        
        connection = ConnectBd.getConnection();
    }
    
    //BUSCA TODOS PRODUTOS
    public void buscarProdutos(JComboBox combo) throws SQLException{
        connection = ConnectBd.getConnection();
        combo.removeAllItems();
        String sql = "SELECT * FROM produto";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet result = statement.executeQuery();
        combo.addItem("");    
        while (result.next()){
            
        String produto = (result.getInt(1) + " |Produto: " + result.getString(2));
        
        combo.addItem(produto);
            
        }
    }
    
    //RETORNA VALOR DO PRODUTO
        public double buscarValorProduto(int id) throws SQLException{
        connection = ConnectBd.getConnection();
        String sql = "SELECT * FROM produto WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        
        ResultSet result = statement.executeQuery();
        result.next();
        
        return result.getDouble(3);
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
    public boolean deletProduto(Produto produto) throws SQLException {
        String sql = "DELETE FROM produto WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, produto.getId());

        int rowsDeleted = statement.executeUpdate();

        return rowsDeleted > 0;
    }
    
    //INSERE #BALANÇO QUANTIDADE PRODUTO
    public boolean balancoQuantidadeProduto (Produto produto) throws SQLException {
        String sql = "UPDATE produto SET quantidade=? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, produto.getQuantidade());
        statement.setInt(2, produto.getId());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    //RETORNA QUANTIDADE DO ESTOQUE DO PRODUTO
    public int quantidadeEstoqueProduto(Produto produto) throws SQLException {
        String sql = "SELECT quantidade FROM produto WHERE id=?";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, produto.getId());
        
        ResultSet result = statement.executeQuery();
        result.next();
        
        return result.getInt(1);
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
