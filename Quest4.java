import java.util.Scanner;

public class Quest4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe a quantidade: ");
        int quantProduto = scanner.nextInt();

        System.out.print("Informe o preço unitário: ");
        double precoUni = scanner.nextDouble();

        double total = precoUni * quantProduto;

        System.out.println("\nDetalhes do item:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantProduto);
        System.out.println("Valor Unitário: R$" + precoUni);
        System.out.println("Total: R$" + total);

        System.out.print("\nInforme o valor de desconto desejado (em porcentagem): ");
        double desconto = scanner.nextDouble();

        double valorDesconto = (desconto / 100) * total;
        double valorFinal = total - valorDesconto;

        System.out.println("Valor Total: R$" + total);
        System.out.println("Valor com Desconto: R$" + valorFinal);

        scanner.close();
    }

}