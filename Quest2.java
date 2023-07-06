import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " o número é par.");
            } else {
                System.out.println(numero + " o número é ímpar.");
            }

            System.out.println("Deseja coletar outro número? (S/N)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("prograna encerrado /n obrigado pela preferencia ^~^ ate a proxima!");
        scanner.close();
    }
    
}