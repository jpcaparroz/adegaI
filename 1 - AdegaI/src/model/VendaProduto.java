package model;

public class VendaProduto {
    
    private int id_venda;
    private int id_produto;
    private int quantidade;

    public VendaProduto(int id_venda, int id_produto, int quantidade) {
        this.id_venda = id_venda;
        this.id_produto = id_produto;
        this.quantidade = quantidade;
    }
    
    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
