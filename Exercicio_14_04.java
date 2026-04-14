import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {

        //criar vetor
        double[] faturamentos = new double[5];

        Scanner scanner = new Scanner(System.in);

        //faturamento
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o faturamento do caixa " + (i + 1) + ": ");
            faturamentos[i] = scanner.nextDouble();
        }

        //criar variaveis
        double soma = 0;
        double maiorValor = faturamentos[0];
        double menorValor = faturamentos[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        //ler vetor
        for (int i = 0; i < 5; i++) {

            soma += faturamentos[i];

            if (faturamentos[i] > maiorValor) {
                maiorValor = faturamentos[i];
                indiceMaior = i;
            }


            if (faturamentos[i] < menorValor) {
                menorValor = faturamentos[i];
                indiceMenor = i;
            }
        }

        //calcular a media
        double media = soma / 5;


        
        //desafio
        int acimaMedia = 0;
        for (int i = 0; i < 5; i++) {
            if (faturamentos[i] > media) {
                acimaMedia++;

            }
        }

        
        System.out.println("Total do dia: " + soma);
        System.out.println("Media por caixa: " + media);
        System.out.println("Maior venda: Caixa " + (indiceMaior + 1) + " com " + maiorValor);
        System.out.println("Menor venda: Caixa " + (indiceMenor + 1) + " com " + menorValor);
        System.out.println("Caixas acima da media: " + acimaMedia);


    }
}
