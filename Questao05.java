import java.util.Random;
import java.util.Scanner;

public class Questao05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int numeroSecreto, tentativaNumero, tentativas = 0;

    numeroSecreto = random.nextInt(101);
    // System.out.println(numeroSecreto);

    System.out.println(
      "Estou pensando em um número entre 1 e 100...\nTente adivinhar o número: "
    );

    while (true) {
      System.out.print("Digite seu palpite: ");
      tentativaNumero = scanner.nextInt();

      tentativas++;

      if (tentativaNumero < numeroSecreto) {
        System.out.println("Muito baixo. Tente novamente.");
      } else if (tentativaNumero > numeroSecreto) {
        System.out.println("Muito alto. Tente novamente.");
      } else {
        System.out.println(
          "Parabéns! Você acertou o número em " + tentativas + " tentativas!"
        );
        break;
      }
    }

    scanner.close();
  }
}
