package dao;

import bd.ConnectBd;
import model.Funcionario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionarioDAO {
    
    Connection connection;
    
    public FuncionarioDAO() throws SQLException{

        connection = ConnectBd.getConnection();
    }
    
    //INSERE FUNCIONARIO
    public boolean insertFuncionario (Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, login, senha, admin) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, funcionario.getNome());
        statement.setString(2, funcionario.getLogin());
        statement.setString(3, funcionario.getSenha());
        statement.setBoolean(4, funcionario.isAdmin());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;
    }
    
    //BUSCA FUNCIONARIO PELO #ID
    public Funcionario findFuncionarioId(int id) throws SQLException {
        String sql = "SELECT * FROM funcionario WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet result = statement.executeQuery();

        if (result.next()) {
        Funcionario funcionario = new Funcionario(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBoolean(5));
        return funcionario;
        }
        return null;
    }
    
    //VERIFICAR LOGIN FUNCIONARIO *CADASTRO
    public boolean verifyFuncionarioLoginCadastro(String login) throws SQLException {
        
        String sql = "SELECT * FROM funcionario WHERE login=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, login);
        
        ResultSet result = statement.executeQuery();
        
        return result.next();
    }
    
    //VERIFICAR LOGIN FUNCIONARIO
    public boolean verifyFuncionarioLogin(String login, String senha) throws SQLException {
        
        String sql = "SELECT * FROM funcionario WHERE login=? and senha=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, senha);

        ResultSet result = statement.executeQuery();
        
        return result.next() == true;
    }
    
    //VERIFICAR LOGIN ADMIN
    public boolean verifyFuncionarioAdm(String login, String senha) throws SQLException {
        
        String sql = "SELECT * FROM funcionario WHERE login=? and senha=? and admin=1";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, senha);

        ResultSet result = statement.executeQuery();
        
        return result.next() == true;
        
    }

    //RETORNAR NOME DO FUNCIONARIO
    public Funcionario verifyFuncionario(String login, String senha) throws SQLException {
        
        String sql = "SELECT * FROM funcionario WHERE login=? and senha=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, senha);

        ResultSet result = statement.executeQuery();
        
        result.next();
        Funcionario funcionario = new Funcionario(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBoolean(5));
        
        return funcionario;
    }
    
    //RETORNA QUANTIDADE DE ADMINISTRADORES
    public int quantidadeAdministrador () throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM funcionario WHERE admin=1";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet result = statement.executeQuery();
        result.next();
        int count = result.getInt("total");
        return count;
    }
    
    //RETORNA QUANTIDADE DE FUNCIONÁRIOS
    public int quantidadeFuncionario () throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM funcionario WHERE admin=0";
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
