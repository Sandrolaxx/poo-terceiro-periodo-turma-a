package NATHAN_MARIOTTO.segundobi.prova;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {
    private static final HttpClient cliente = HttpClient.newHttpClient();

    public static String enviarGet(String url) throws IOException, InterruptedException {
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        if (resposta.statusCode() != 200) {
            throw new IOException("Erro na requisição: " + resposta.statusCode());
        }
        return resposta.body();
    }

    public static String enviarPost(String url, String json) throws IOException, InterruptedException {
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        if (resposta.statusCode() != 201) {
            throw new IOException("Erro na requisição: " + resposta.statusCode() + " - " + resposta.body());
        }
        return resposta.body();
    }
}
