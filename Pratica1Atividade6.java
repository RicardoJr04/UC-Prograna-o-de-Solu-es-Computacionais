import java.util.Scanner;

public class Pratica1Atividade6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;
        
        System.out.print("Digite o raio do círculo: ");
        raio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A área do círculo é: " + area);
    }

}
