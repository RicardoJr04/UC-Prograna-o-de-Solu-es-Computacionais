import java.util.Scanner;

public class Pratica1Atividade12 {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double altura, pesoIdeal;
      System.out.print("Digite sua altura em metros: ");
      altura = entrada.nextDouble();
      pesoIdeal = (72.7 * altura) - 58;
      System.out.println("Seu peso ideal é " + pesoIdeal + " kg.");
   }
}
