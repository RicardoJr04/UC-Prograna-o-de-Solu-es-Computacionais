import java.util.Scanner;

public class Pratica1Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int METROS_QUADRADOS_POR_LITRO = 3;
        final double PRECO_LATA_DE_TINTA = 80.0;
        final int LITROS_POR_LATA_DE_TINTA = 18;

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        int metrosQuadrados = input.nextInt();

        int litrosDeTinta = (int) Math.ceil(metrosQuadrados / (double) METROS_QUADRADOS_POR_LITRO);
        int latasDeTinta = (int) Math.ceil(litrosDeTinta / (double) LITROS_POR_LATA_DE_TINTA);
        double precoTotal = latasDeTinta * PRECO_LATA_DE_TINTA;

        System.out.printf("Você precisará de %d latas de tinta, ao custo de R$ %.2f.%n", latasDeTinta, precoTotal);

        input.close();
    }
}
