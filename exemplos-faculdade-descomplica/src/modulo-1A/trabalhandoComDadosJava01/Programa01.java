package trabalhandoComDadosJava01;

/**
 * Description of Programa01
 * Created by calle on 10/07/2024.
 */
public class Programa01 {

    public static void main(String entrada[]) {

        if (entrada.length < 3) {
            System.out.println("Por favor, forneça três argumentos: um inteiro, um real e um caractere.");
            System.exit(1);
        }

        try {
            // Declaração de variáveis
            int NumInt;
            double NumReal, soma;
            char Caracter;

            // Entrada de dados
            NumInt = Integer.parseInt(entrada[0]);
            NumReal = Double.parseDouble(entrada[1]);
            Caracter = entrada[2].charAt(0);

            soma = (double) NumInt + NumReal;

            System.out.println((double)NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, forneça um número inteiro válido para o primeiro argumento e um número real válido para o segundo argumento.");
            System.exit(1);
        }

        System.exit(0);
    }
}
