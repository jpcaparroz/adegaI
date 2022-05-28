
package model;

public class Funcionario {
    
    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean admin;
    
    public Funcionario(int id, String nome, String login, String senha, boolean admin) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }
    
    public Funcionario(String nome, String login, String senha, boolean admin) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    public Funcionario(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", admin=" + admin;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}
