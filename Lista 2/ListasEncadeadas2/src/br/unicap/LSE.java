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

    public void inserir(T numero) {
        LSENode<T> novo;
        novo = new LSENode(numero);
        if (qtd == 0) {
            prim = novo;
            ult = novo;
            qtd++;
        } else {
            boolean retorno = verificarRepetido(numero);
            if (retorno == true) {
                System.out.println("Numero repetido!");
            } else {
                ult.setProx(novo);
                ult = novo;
                qtd++;
            }
        }
    }

    public boolean verificarRepetido(T numero) {
        LSENode<T> aux = prim;
        if (numero.equals(prim.getInfo())) {
            return true;
        } else {
            while (aux != null) {
                if (aux.getInfo().equals(numero)) {
                    return true;
                }
                aux = aux.getProx();
            }
        }
        return false;
    }

    public void printar() {
        LSENode<T> aux = prim;
        while (aux != null) {
            System.out.print(aux.toString() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}
