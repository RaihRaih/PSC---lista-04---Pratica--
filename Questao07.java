import java.util.Scanner;

public class Questao07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção:");
    System.out.println("1. Retângulo");
    System.out.println("2. Diagonal Superior Esquerda");
    System.out.println("3. Diagonal Superior Direita");
    System.out.println("4. Diagonal Inferior Esquerda");
    System.out.println("5. Diagonal Inferior Direita");
    System.out.print("Opção: ");
    int opcao = scanner.nextInt();

    System.out.print("Quantidade de colunas: ");
    int colunas = scanner.nextInt();

    switch (opcao) {
      case 1:
        desenharRetangulo(colunas);
        break;
      case 2:
        desenharDiagonalSuperiorEsquerda(colunas);
        break;
      case 3:
        desenharDiagonalSuperiorDireita(colunas);
        break;
      case 4:
        desenharDiagonalInferiorEsquerda(colunas);
        break;
      case 5:
        desenharDiagonalInferiorDireita(colunas);
        break;
      default:
        System.out.println("Opção inválida!");
    }

    scanner.close();
  }

  public static void desenharRetangulo(int colunas) {
    for (int i = 0; i < colunas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void desenharDiagonalSuperiorEsquerda(int colunas) {
    for (int i = 0; i < colunas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (j <= i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void desenharDiagonalSuperiorDireita(int colunas) {
    for (int i = 0; i < colunas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (j >= i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void desenharDiagonalInferiorEsquerda(int colunas) {
    for (int i = 0; i < colunas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (j >= i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void desenharDiagonalInferiorDireita(int colunas) {
    for (int i = 0; i < colunas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (j <= i) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
