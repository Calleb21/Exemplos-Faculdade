package org.example.operadores;

import java.util.Scanner;

public class Aula02Exemplo2 {

    public static void main(String[] args) {

        int valor = 15;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        System.out.println(valor/2);
        System.out.println(valor%2);

        teclado.close();
    }
}
