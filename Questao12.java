import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da série: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int termo = (i + 1) / 2 + i % 2 * (i / 2);
            System.out.print(termo + " ");
        }

        scanner.close();
    }
}
