import java.util.Scanner;

public class Pratica1Atividade18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivo = sc.nextDouble();

        System.out.print("Informe a velocidade do link de internet em Mbps: ");
        double velocidadeInternet = sc.nextDouble();

        // conversão de MB para Mbps
        double tamanhoArquivoMbps = tamanhoArquivo * 8;

        // cálculo do tempo de download em minutos
        double tempoDownloadMin = tamanhoArquivoMbps / velocidadeInternet / 60;

        System.out.printf("Tempo aproximado de download: %.2f minutos", tempoDownloadMin);

        sc.close();
    }

}
