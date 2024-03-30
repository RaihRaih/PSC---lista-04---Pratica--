import java.util.Random;
import java.util.Scanner;

public class Questao06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    char continuarJogo = 's'; // Inicializa com 's' para entrar no loop na primeira iteração

    while (continuarJogo == 's' || continuarJogo == 'S') {
      int numeroSecreto = random.nextInt(101); // Move a geração do número secreto para dentro do loop
      int tentativaNumero, tentativas = 0;

      System.out.println("Estou pensando em um número entre 1 e 100...");
      System.out.println("Tente adivinhar o número:");

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

      System.out.println("Deseja continuar jogando? [S/N]");
      continuarJogo = scanner.next().charAt(0);

      // Limpa o buffer do scanner antes de verificar se o jogo deve continuar
      scanner.nextLine();
    }

    scanner.close();
  }
}
