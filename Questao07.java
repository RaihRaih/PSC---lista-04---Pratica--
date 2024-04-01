import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        System.out.print("Quantidade de colunas: ");
        int colunas = scanner.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 0; i < colunas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Define the method desenharDiagonalSuperiorEsquerda(colunas) here
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
                break;

            case 3:
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
                break;

            case 4:
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
                break;

            case 5:
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
                break;

            default:
                System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}
