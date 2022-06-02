package model;

public class Produto {
    
    private int id;
    private String nome;
    private double valor;
    private int quantidade;
    private String tipo;

    public Produto(int id, String nome, double valor, int quantidade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public Produto(String nome, double valor, int quantidade, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }
    
    public Produto(int quantidade, String nome) {
        this.quantidade = quantidade;
        this.nome = nome;
    }
    
        public Produto(String nome) {
        this.nome = nome;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
