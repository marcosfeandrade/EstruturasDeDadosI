package br.unicap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LSE<Integer> listaA = new LSE();
        LSE<Integer> listaB = new LSE();
        int num;
        char resp;
        do {
            System.out.println("-----------MENU----------");
            System.out.println("Menu de opções:\n"
                    + "1 – Armazenar número\n"
                    + "2 – Procurar número\n"
                    + "3 – Exibir números pares\n"
                    + "4 – Exibir números ímpares\n"
                    + "5 – Encerrar programa");
            resp = in.next().charAt(0);
            if (resp == '1') {
                System.out.println("Numero: ");
                num = in.nextInt();
                if (num % 2 == 0) {
                    listaA.inserir(num);
                } else {
                    listaB.inserir(num);
                }
            } else if (resp == '2') {
                System.out.println("Numero buscado: ");
                int numBuscado = in.nextInt();
                if (numBuscado % 2 == 0) {
                    listaA.verificarRepetido(numBuscado);
                } else {
                    listaB.verificarRepetido(numBuscado);
                }
            } else if (resp == '3') {
                System.out.println("--------------------");
                listaA.printar();
                System.out.println("--------------------");
            } else if (resp == '4') {
                System.out.println("--------------------");
                listaB.printar();
                System.out.println("--------------------");
            }
        } while (resp != '5');

    }

    public static void inserirValor(LSE lista, int num) {
        lista.inserir(num);
        System.out.println("Número inserido.");
    }
}
