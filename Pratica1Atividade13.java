import java.util.Scanner;

public class Pratica1Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, pesoIdeal;
        char genero;

        System.out.print("Digite sua altura em metros: ");
        altura = input.nextDouble();

        System.out.print("Digite seu gênero (M para masculino, F para feminino): ");
        genero = input.next().charAt(0);

        if (genero == 'M' || genero == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
        } else if (genero == 'F' || genero == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é %.2f kg.", pesoIdeal);
        } else {
            System.out.println("Gênero inválido!");
        }

        input.close();
    }
}
