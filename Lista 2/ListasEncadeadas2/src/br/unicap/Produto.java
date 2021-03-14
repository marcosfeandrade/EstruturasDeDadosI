package br.unicap;

public class Produto implements Comparable<Produto> {

    private String cod;
    private String desc;
    private double preco;
    private int estoque;

    Produto(String cod, String desc, double preco, int estoque) {
        this.cod = cod;
        this.desc = desc;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    @Override
    public int compareTo(Produto p) {
        return this.cod.compareTo(p.getCod());
    }
    
    public String toString() {
        return "código: " + cod + " "/*+ "\nDescrição: " + desc + "\nPreço: R$" + preco + "\nEstoque: " + estoque + " Produtos\n"*/;
    }
}
