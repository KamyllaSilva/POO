import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        int idadeMinima;
        int anosMinimosContribuicao = 15;

        if (sexo == 'M' || sexo == 'm') {
            idadeMinima = 65;
        } else {
            idadeMinima = 62;
        }

        if (idade >= idadeMinima && anosContribuicao >= anosMinimosContribuicao) {
            System.out.println("Pode se aposentar.");
        } else {
            int anosRestantesIdade = Math.max(0, idadeMinima - idade);
            int anosRestantesContribuicao = Math.max(0, anosMinimosContribuicao - anosContribuicao);
            System.out.printf("Faltam %d anos para se aposentar.%n", 
                              Math.max(anosRestantesIdade, anosRestantesContribuicao));
        }

        scanner.close();
    }
}
