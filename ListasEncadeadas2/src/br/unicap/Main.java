package br.unicap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSE <Integer> lista = new LSE();
        int num;
        char resp;
        do {
            System.out.println("1 - inserir numero");
            System.out.println("2 - imprimir lista");
            System.out.println("3 - encerrar");
            resp = in.next().charAt(0);
            if (resp == '1') {
                System.out.println("numero: ");
                num = in.nextInt();
                inserirPrimeiro(lista, num);
            } else if (resp == '2'){
                System.out.println("--------------------");
                lista.printar();
                System.out.println("--------------------");
            }
        } while (resp != '3');

    }

    public static void inserirPrimeiro(LSE lista, int num) {
        lista.inserirPrimeiro(num);
        System.out.println("Número inserido.");
    }
}
