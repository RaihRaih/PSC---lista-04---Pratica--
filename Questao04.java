import java.util.Scanner;

public class Questao04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int kills = 0, deaths = 0, assists = 0, killsRodada = 0, deathsRodada =
      0, assistsRodada = 0;
    boolean haVencedor = false;

    while (!haVencedor) {
      System.out.println("Informe o número de kills da rodada:");
      killsRodada = scanner.nextInt();
      kills = kills + killsRodada;

      System.out.println("Informe o número de deaths da rodada:");
      deathsRodada = scanner.nextInt();
      deaths = deaths + deathsRodada;

      System.out.println("Informe o número de assists da rodada:");
      assistsRodada = scanner.nextInt();
      assists = assists + assistsRodada;

      if (killsRodada <= 5) {
        System.out.println("Noob");
      } else if (killsRodada >= 20) {
        System.out.println("Master");
      }

      if (deathsRodada >= 20) {
        System.out.println("Houston, we have a problem");
      }

      if (assistsRodada >= 20) {
        System.out.println("Team work");
      }

      System.out.println("Há um vencedor? (S/N)");
      char resposta = scanner.next().charAt(0);
      if (resposta == 'S' || resposta == 's') {
        haVencedor = true;
      }
    }

    scanner.close();
  }
}
