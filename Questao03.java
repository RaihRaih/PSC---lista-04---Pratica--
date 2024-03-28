import java.util.Scanner;

public class Questao03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade = 0, i = 0, idadeMaior50 = 0;
    double mediaAlturas10e20Anos = 0, porcentagemPesoInferiorA40Kg = 0;
    double somaAlturas10e20Anos = 0;
    int quantidadePessoasIdadeEntre10e20Anos = 0;
    int quantidadePessoasPesoInferiorA40Kg = 0;

    for (i = 0; i < 10; i++) {
      System.out.println("Digite sua idade, sua altura e seu peso: ");
      idade = scanner.nextInt();
      double altura = scanner.nextDouble();
      double peso = scanner.nextDouble();

      if (idade > 50) {
        idadeMaior50++;
      }

      if (idade >= 10 && idade <= 20) {
        somaAlturas10e20Anos += altura;
        quantidadePessoasIdadeEntre10e20Anos++;
      }

      if (peso < 40) {
        quantidadePessoasPesoInferiorA40Kg++;
      }
    }

    // Calculando a média das alturas das pessoas com idade entre 10 e 20 anos
    if (quantidadePessoasIdadeEntre10e20Anos > 0) {
      mediaAlturas10e20Anos =
        somaAlturas10e20Anos / quantidadePessoasIdadeEntre10e20Anos;
    }

    // Calculando a porcentagem de pessoas com peso inferior a 40 quilos
    porcentagemPesoInferiorA40Kg =
      (quantidadePessoasPesoInferiorA40Kg * 100.0) / 10; // 10 é o total de pessoas

    System.out.println(
      "a) Quantidade de pessoas com idade superior a 50 anos: " + idadeMaior50
    );
    System.out.println(
      "b) Média das alturas das pessoas com idade entre 10 e 20 anos: " +
      mediaAlturas10e20Anos
    );
    System.out.println(
      "c) Porcentagem de pessoas com peso inferior a 40 quilos: " +
      porcentagemPesoInferiorA40Kg +
      "%"
    );

    scanner.close();
  }
}
