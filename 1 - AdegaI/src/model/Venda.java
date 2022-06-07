package model;

public class Venda {
    
    private int id;
    private String data;
    private double valor;
    private int id_cliente;
    private int id_funcionario;

    public Venda(int id, String data, double valor, int id_cliente, int id_funcionario) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
    }

    public Venda(String data, double valor, int id_cliente, int id_funcionario) {
        this.data = data;
        this.valor = valor;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    
    
}
