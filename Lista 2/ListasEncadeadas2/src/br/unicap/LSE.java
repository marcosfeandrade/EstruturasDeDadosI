package br.unicap;

import java.util.Scanner;

public class LSE<T extends Produto> {

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

    public void inserirInicio(T objeto) {
        LSENode<T> novo;
        novo = new LSENode(objeto);
        if (qtd == 0) {
            prim = novo;
            ult = novo;
            qtd++;
        } else {
            if (buscarProduto(objeto) != null) {
                System.out.println("Numero repetido!");
            } else {
                novo.setProx(prim);
                prim = novo;
                qtd++;
            }
        }
    }

    public void inserirFinal(T objeto) {
        LSENode<T> novo;
        novo = new LSENode(objeto);
        if (qtd == 0) {
            prim = novo;
            ult = novo;
            qtd++;
        } else {
            if (buscarProduto(objeto) != null) {
                System.out.println("Numero repetido!");
            } else {
                ult.setProx(novo);
                ult = novo;
                qtd++;
            }
        }
    }

    public T buscarProduto(T objeto) {
        LSENode<T> aux = prim;
        if (qtd == 0) {
            return null;
        }
        if (objeto.compareTo(prim.getInfo()) == 0) {
            return aux.getInfo();
        }
        for (int i = 0; i < qtd; i++) {
            if (objeto.compareTo(aux.getInfo()) == 0) {
                return aux.getInfo();
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void printarTodos() {
        LSENode aux = prim;
        if (qtd == 0) {
            System.out.println("Lista vazia!");
        }
        while (aux != null) {
            System.out.print(aux.toString() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

    public void removerInicio() {
        if (qtd == 0) {
            System.out.println("Lista vazia!");
        } else {
            if (prim.getProx() == null) {
                ult = ult.getProx();
            }
            prim = prim.getProx();
        }
        --qtd;
    }

    public void removerFinal() {
        LSENode aux = prim;
        LSENode aux2 = aux;
        if (qtd == 0) {
            System.out.println("Lista vazia!");
        }
        if (prim == ult) {
            prim = null;
            ult = null;
        } else {
            while (aux.getProx() != ult.getProx()) {
                aux2 = aux;
                aux = prim.getProx();
            }
            ult = aux2;
            ult.setProx(null);
        }
        --qtd;
    }
}
