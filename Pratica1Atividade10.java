import java.util.Scanner;

public class Pratica1Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }
}