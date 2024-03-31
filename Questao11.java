public class Questao11 {

    public static void main(String[] args) {
        double massaInicial = 1.0; // Massa inicial do material
        double massaAtual = massaInicial;
        int tempo = 0; // Tempo decorrido

        // Loop enquanto a massa atual for maior ou igual a 0,10 grama
        while (massaAtual >= 0.10) {
            // Reduzindo a massa em 25%
            massaAtual *= 0.75; // Perda de 25%
            tempo += 30; // Incrementando o tempo em 30 segundos
        }

        System.out.println("Tempo necessário: " + tempo + " segundos");
    }
}
