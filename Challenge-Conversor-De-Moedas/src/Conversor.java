import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

    Scanner leitor = new Scanner(System.in);

    public void mostrarMenu() {
        String menu = """
                ************************************************
                Seja bem vindo/a ao Conversor de Moedas :)
                
                1) Dólar ==> Euro
                2) Euro ==> Dólar
                3) Dólar ==> Real Brasileiro
                4) Real Brasileiro ==> Dólar
                5) Dólar ==> Iene Japonês
                6) Peso Colombiano ==> Dólar
                7) Sair
                
                Escolha uma opção válida:
                ************************************************
                """;
        System.out.println(menu);
    }

    public double pegarCotacao(String moedaOrigem, String moedaDestino) throws Exception {
        String apiKey = "fe3e5674ed476e93a7c57d72"; // Substitua pela sua chave de API
        String endpoint = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem;
        URI endereco = URI.create(endpoint);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        double taxaDeCambio = json.getAsJsonObject("conversion_rates").get(moedaDestino).getAsDouble();

        return taxaDeCambio;
    }

    public void converterMoeda() {
        try {
            mostrarMenu();
            int opcao = leitor.nextInt();
            double valor = 0;
            String moedaOrigem = "";
            String moedaDestino = "";

            switch (opcao) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "EUR";
                    break;
                case 2:
                    moedaOrigem = "EUR";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "USD";
                    moedaDestino = "JPY";
                    break;
                case 6:
                    moedaOrigem = "COP";
                    moedaDestino = "USD";
                    break;
                case 7:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.print("Digite o valor que deseja converter: ");
            valor = leitor.nextDouble();

            double cotacao = pegarCotacao(moedaOrigem, moedaDestino);
            double valorConvertido = valor * cotacao;

            System.out.printf("%.2f %s equivale a %.2f %s%n", valor, moedaOrigem, valorConvertido, moedaDestino);

        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
