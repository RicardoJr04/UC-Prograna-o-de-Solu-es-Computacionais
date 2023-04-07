import java.util.Scanner;

public class Pratica1Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = input.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();
        
        double salarioMensal = valorHora * horasTrabalhadas;
        
        System.out.println("Seu salário mensal é de R$" + salarioMensal);
    }
}
