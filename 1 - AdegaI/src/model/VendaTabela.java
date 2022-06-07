package model;

public class VendaTabela {
    
    private int id_produto;
    private String produto;
    private int quantidade;
    private double valor;
    private double total;

    public VendaTabela(int id_produto, String produto, int quantidade, double valor, double total) {
        this.id_produto = id_produto;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.total = total;
    }
    
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
