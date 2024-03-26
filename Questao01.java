/*Raissa Rodrigues - Sistemas de Informação 
1. Crie um programa que lê vários números inteiros e positivos e imprima o 
produto dos números ímpares e a soma dos números pares.
*/
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int produtoImpar = 1; // Inicialize o produto com 1 (multiplicação)
        int somaPar = 0; // Inicialize a soma com 0

        while (true) {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }

            if (numero % 2 == 0) {
                somaPar += numero; // Adiciona o número à soma dos pares
            } else {
                produtoImpar *= numero; // Multiplica o número ao produto dos ímpares
            }
        }
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Produto dos números ímpares: " + produtoImpar);
    }
}
