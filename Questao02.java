
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero, quadrado, cubo, raiz;

        do {

            System.out.println("\nDigite um numero inteiro e descubra o seu quadrado, cubo e sua raiz (digite -1 para sair do programa): ");
            numero = scanner.nextDouble();

            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            raiz = Math.sqrt(numero);

            System.out.println("\nnumero: " + numero + "\nquadrado: "+ quadrado + "\ncubo: " + cubo + "\nraiz: " + raiz);
 
        } while (numero != -1);

    }
}
