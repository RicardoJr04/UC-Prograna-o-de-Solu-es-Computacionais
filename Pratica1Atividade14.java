import java.util.Scanner;

public class Pratica1Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double peso, excesso, multa;
        final double LIMITE = 50.0;
        final double PRECO_POR_QUILO_EXCEDENTE = 4.0;
        
        System.out.print("Digite o peso dos peixes em quilos: ");
        peso = sc.nextDouble();
        
        if (peso > LIMITE) {
            excesso = peso - LIMITE;
            multa = excesso * PRECO_POR_QUILO_EXCEDENTE;
            System.out.printf("João deverá pagar uma multa de R$ %.2f pelos %.2f quilos excedentes.%n", multa, excesso);
        } else {
            System.out.println("Não houve excesso de peso. Nenhuma multa será aplicada.");
        }
        
        sc.close();
    }
}
