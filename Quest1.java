import java.util.Scanner;

public class Quest1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaMedias = 0;
        double maiorMedia = 0;
        double menorMedia = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            double somaNotas = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j, i);
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 4;
            somaMedias += media;

            System.out.printf("Média do aluno %d: %.2f\n", i, media);

            if (media > maiorMedia) {
                maiorMedia = media;
            }

            if (media < menorMedia) {
                menorMedia = media;
            }

            if (media >= 5.0) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }

        double mediaDasMedias = somaMedias / 10;
        System.out.printf("\nMédias das médias dos alunos: %.2f\n", mediaDasMedias);
        System.out.printf("Maior média: %.2f\n", maiorMedia);
        System.out.printf("Menor média: %.2f\n", menorMedia);

        scanner.close();
    }
}