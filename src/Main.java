import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Instância da classe ConversorMoedas e variaveis
        ConversorMoedas conversor = new ConversorMoedas();
        int opc;
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1) Dólar >> Real");
            System.out.println("2) Real >> Dólar");
            System.out.println("3) Dólar >> Peso Argentino");
            System.out.println("4) Peso Argentino >> Dólar");
            System.out.println("5) Dólar >> Peso Colombiano");
            System.out.println("6) Peso Colombiano >> Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");
            opc = ler.nextInt();
//Exita o programa
            if (opc == 7) {
                System.out.println("Saindo... Até logo!");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = ler.nextDouble();
//Tenta converter caso de primeira, caso de erros tratados mais a baixo
            try {
                double valorConvertido = 0;
                switch (opc) {
                    case 1: // Dólar >> Real
                        valorConvertido = conversor.converterMoeda("USD", "BRL", valor);
                        break;
                    case 2: // Real >> Dólar
                        valorConvertido = conversor.converterMoeda("BRL", "USD", valor);
                        break;
                    case 3: // Dólar >> Peso Argentino
                        valorConvertido = conversor.converterMoeda("USD", "ARS", valor);
                        break;
                    case 4: // Peso Argentino >> Dólar
                        valorConvertido = conversor.converterMoeda("ARS", "USD", valor);
                        break;
                    case 5: // Dólar >> Peso Colombiano
                        valorConvertido = conversor.converterMoeda("USD", "COP", valor);
                        break;
                    case 6: // Peso Colombiano >> Dólar
                        valorConvertido = conversor.converterMoeda("COP", "USD", valor);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }

                // Exibe o valor convertido
                System.out.printf("Valor convertido: %.2f%n", valorConvertido);
                System.out.println("====================================");
            } catch (IOException | InterruptedException e) {
                System.err.println("Erro ao acessar a API. Verifique sua conexão: " + e.getMessage());
            }
        }

        ler.close();
    }
}
