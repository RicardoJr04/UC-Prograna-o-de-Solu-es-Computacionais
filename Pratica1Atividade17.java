import java.util.Scanner;
import java.lang.Math;

public class Pratica1Atividade17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedindo o tamanho da área a ser pintada
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double tamanhoArea = input.nextDouble();

        // Calculando a quantidade de litros de tinta necessários
        double litrosTinta = tamanhoArea / 6.0;
        litrosTinta *= 1.1; // Adicionando 10% de folga
        int latas18L = (int) Math.ceil(litrosTinta / 18.0); // Quantidade de latas de 18 litros arredondada para cima
        int galoes36L = (int) Math.ceil(litrosTinta / 3.6); // Quantidade de galões de 3,6 litros arredondada para cima

        // Calculando os preços
        double precoLatas18L = latas18L * 80.0;
        double precoGaloes36L = galoes36L * 25.0;
        int latas18LRestantes = (int) Math.ceil((litrosTinta - (galoes36L * 3.6)) / 18.0); // Quantidade de latas de 18 litros restantes na mistura
        double precoMistura = (galoes36L * 25.0) + (latas18LRestantes * 80.0);

        // Imprimindo os resultados
        System.out.println("Você precisa comprar " + latas18L + " lata(s) de 18 litros de tinta, ao custo total de R$" + precoLatas18L);
        System.out.println("Você precisa comprar " + galoes36L + " galão(ões) de 3,6 litros de tinta, ao custo total de R$" + precoGaloes36L);
        System.out.println("Você precisa comprar " + galoes36L + " galão(ões) de 3,6 litros e " + latas18LRestantes + " lata(s) de 18 litros de tinta, ao custo total de R$" + precoMistura);
    }
}
