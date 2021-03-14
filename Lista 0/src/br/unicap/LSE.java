package br.unicap;

public class LSE<T> {

    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;

    public LSENode<T> getPrim() {
        return prim;
    }

    public void setPrim(LSENode<T> prim) {
        this.prim = prim;
    }

    public LSENode<T> getUlt() {
        return ult;
    }

    public void setUlt(LSENode<T> ult) {
        this.ult = ult;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void inserirPrimeiro(int numero) {
        LSENode novoNo = new LSENode(numero);
        if (prim == null) {
            ult = novoNo;
        }
        novoNo.setProx(prim);
        prim = novoNo;
        ++qtd;
    }

    public void printar() {
        LSENode aux = prim;
        while (aux != null) {
            System.out.print(aux.toString() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}
