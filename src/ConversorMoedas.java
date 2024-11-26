import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ConversorMoedas {
    private static final string APIKEY = "SUA API KEY AQUI"
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/8bf7db8d7"+APIKEY+"/latest/"; // api q retorna valores das moedas e suas siglas
    public double converterMoeda(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + moedaOrigem))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        // Obtém a taxa de conversão
        double taxa = jsonResponse.getAsJsonObject("conversion_rates").get(moedaDestino).getAsDouble(); // pega valor de conversão!

        // Retorna o valor convertido
        return valor * taxa;
    }
}
