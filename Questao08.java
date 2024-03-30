import java.util.Scanner;

public class Questao08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de A (número real): ");
    double A = scanner.nextDouble();

    System.out.print("Digite o valor de B (número inteiro): ");
    int B = scanner.nextInt();

    double produto = calcularProduto(A, B);
    System.out.println("O produto de A por B é: " + produto);

    scanner.close();
  }

  public static double calcularProduto(double A, int B) {
    double produto = 0;
    for (int i = 0; i < B; i++) {
      produto += A;
    }
    return produto;
  }
}
