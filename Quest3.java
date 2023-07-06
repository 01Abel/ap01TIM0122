import java.util.Scanner;

public class Quest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual foi a distância percorrida em Km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Qual a bandeira ultilizada (1 ou 2): ");
        int bandeira = scanner.nextInt();

        double valorCorrida = calcularValorCorrida(distancia, bandeira);

        System.out.println("O valor final da corrida é: R$ " + valorCorrida);
        scanner.close();
    }
    
    public static double calcularValorCorrida(double distancia, int bandeira) {
        double precoKm;

        if (bandeira == 1) {
            precoKm = 1.80;
        } else if (bandeira == 2) {
            precoKm = 2.30;
        } else {
            throw new IllegalArgumentException("Informe uma bandeira valida (1 ou 2).");
        }

        double valorCorrida = distancia * precoKm;
        return valorCorrida;
        
       
    }
}