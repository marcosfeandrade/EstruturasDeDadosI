package br.unicap;

class LSENode <T> {
    private T info;
    private LSENode<T> prox;
    
    LSENode(T valor) {
        this.info = valor;
    }

    void setInfo(T valor) {
        info = valor;
    }

    void setProx(LSENode<T> prox) {
        this.prox = prox;
    }
    
    T getInfo(){
        return info;
    }
    
    LSENode<T> getProx () {
        return prox;
    }
    
    public String toString (){
        return info.toString();
    }
}
