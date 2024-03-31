import java.util.Scanner;

public class Questao10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            double maiorNota = Double.MIN_VALUE;
            double segundaMaiorNota = Double.MIN_VALUE;
            int matriculaMaiorNota = 0;
            int matriculaSegundaMaiorNota = 0;
    
            for (int i = 0; i < 100; i++) {
                System.out.println("Ficha do aluno " + (i + 1) + ":");
                System.out.print("Número de matrícula: ");
                int matricula = scanner.nextInt();
                System.out.print("Nota: ");
                double nota = scanner.nextDouble();
    
                if (nota > maiorNota) {
                    segundaMaiorNota = maiorNota;
                    matriculaSegundaMaiorNota = matriculaMaiorNota;
                    maiorNota = nota;
                    matriculaMaiorNota = matricula;
                } else if (nota > segundaMaiorNota) {
                    segundaMaiorNota = nota;
                    matriculaSegundaMaiorNota = matricula;
                }
            }
    
            System.out.println("As duas maiores notas são:");
            System.out.println("1ª maior nota: " + maiorNota + ", número de matrícula: " + matriculaMaiorNota);
            System.out.println("2ª maior nota: " + segundaMaiorNota + ", número de matrícula: " + matriculaSegundaMaiorNota);
    
            scanner.close();
        }
    }
    