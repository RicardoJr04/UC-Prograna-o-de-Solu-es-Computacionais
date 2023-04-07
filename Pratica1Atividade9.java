import java.util.Scanner;

public class Pratica1Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius", fahrenheit, celsius);

        sc.close();
    }
}
