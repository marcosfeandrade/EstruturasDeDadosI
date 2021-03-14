package br.unicap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSE<Produto> lista = new LSE();
        char resp;
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1 – Inserir novo produto no início da lista\n"
                    + "2 – Inserir novo produto no final da lista\n"
                    + "3 – Remover o primeiro produto da lista\n"
                    + "4 – Remover o último produto da lista\n"
                    + "5 – Exibir todos os produtos da lista\n"
                    + "6 – Exibir os dados de um produto da lista\n"
                    + "7 – Alterar os dados de um produto da lista\n"
                    + "0 – Sair do programa");
            resp = in.next().charAt(0);
            in.nextLine();
            if (resp == '1') {
                Produto retorno = inserirDados();
                lista.inserirInicio(retorno);
            } else if (resp == '2') {
                Produto retorno = inserirDados();
                lista.inserirFinal(retorno);
            } else if (resp == '3') {
                lista.removerInicio();
            } else if (resp == '4') {
                lista.removerFinal();
            } else if (resp == '5') {
                lista.printarTodos();
            } else if (resp == '6') {
                printar(lista);
            } else if (resp == '7') {
                alterarDados(lista);
            }
        } while (resp != '0');

    }

    public static Produto inserirDados() {
        Scanner in = new Scanner(System.in);
        System.out.println("Codigo: ");
        String cod = in.nextLine();
        System.out.println("Descrição: ");
        String desc = in.nextLine();
        System.out.println("Preço: ");
        double preco = in.nextDouble();
        System.out.println("Estoque: ");
        int estoque = in.nextInt();
        Produto p = new Produto(cod, desc, preco, estoque);
        return p;
    }

    public static void alterarDados(LSE<Produto> lista) {
        Scanner in = new Scanner(System.in);
        String cod = in.nextLine();
        Produto p = lista.buscarProduto(new Produto(cod, null, 0, 0));
        char resp;
        if (p == null) {
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.println("1- Alterar preço");
            System.out.println("2- Alterar estoque");
            System.out.println("3- Alterar ambos");
            resp = in.next().charAt(0);
            while (resp != '1' && resp != '2' && resp != '3') {
                System.out.println("Resposta inválida");
                System.out.println("1- Alterar preço");
                System.out.println("2- Alterar estoque");
                System.out.println("3- Alterar ambos");
                resp = in.next().charAt(0);
            }
            if (resp == '1') {
                System.out.println("Novo preço: ");
                double precoNovo = in.nextDouble();
                p.setPreco(precoNovo);
            } else if (resp == '2') {
                System.out.println("Novo estoque: ");
                int estoqueNovo = in.nextInt();
                p.setEstoque(estoqueNovo);
            } else {
                System.out.println("Novo preço: ");
                double precoNovo = in.nextDouble();
                p.setPreco(precoNovo);
                System.out.println("Novo estoque: ");
                int estoqueNovo = in.nextInt();
                p.setEstoque(estoqueNovo);
            }
        }
    }

    public static void printar(LSE<Produto> lista) {
        Scanner in = new Scanner(System.in);
        String cod = in.nextLine();
        Produto p = lista.buscarProduto(new Produto(cod, null, 0, 0));
        if (p == null) {
            System.out.println("Produto não cadastrado!");
        } else {
            System.out.print(p);
        }
    }
}
