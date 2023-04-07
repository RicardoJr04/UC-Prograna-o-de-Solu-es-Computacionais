import java.util.Scanner;

public class Pratica1Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros correspondem a " + centimetros + " centimetros.");

        sc.close();
    }
}