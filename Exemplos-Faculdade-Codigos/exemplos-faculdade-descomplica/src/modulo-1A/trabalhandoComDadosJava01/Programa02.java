package trabalhandoComDadosJava01;

import java.util.Scanner;

/**
 * Description of Programa02
 * Created by calle on 10/07/2024.
 */
public class Programa02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int NumInt;
        double NumReal, soma;
        char Caracter;

        // Entrada de dados
        System.out.print("Digite um número inteiro: ");
        NumInt = scanner.nextInt();

        System.out.print("Digite um número real: ");
        NumReal = scanner.nextDouble();

        System.out.print("Digite um caractere: ");
        Caracter = scanner.next().charAt(0);

        // Calcula a soma
        soma = NumInt + NumReal;

        // Exibe o resultado
        System.out.println(NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

        // Fecha o Scanner
        scanner.close();

        // Finaliza o programa
        System.exit(0);
    }
}
