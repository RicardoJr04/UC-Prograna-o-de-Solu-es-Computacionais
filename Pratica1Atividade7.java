import java.util.Scanner;

public class Pratica1Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = input.nextDouble();
        
        double area = lado * lado;
        double dobroArea = 2 * area;
        
        System.out.println("Área do quadrado: " + area);
        System.out.println("Dobro da área do quadrado: " + dobroArea);
    }
}
