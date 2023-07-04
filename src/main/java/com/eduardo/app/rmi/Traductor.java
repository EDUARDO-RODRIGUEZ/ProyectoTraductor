package com.eduardo.app.rmi;

import com.eduardo.app.dto.request.TranslateDtoRequest;
import com.eduardo.app.util.Mapper;
import com.eduardo.app.util.Property;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import javax.net.ssl.SSLContext;

public class Traductor extends UnicastRemoteObject implements ITraductor {

    public Traductor() throws RemoteException {
        System.getProperties().setProperty("jdk.internal.httpclient.disableHostnameVerification", Boolean.TRUE.toString());
    }

    @Override
    public String translate(String languageStart, String languageEnd, String text) {
        String url = String.valueOf(Property.get("openia.url")).concat("/completions");
        TranslateDtoRequest body = TranslateDtoRequest.builder()
                .model("text-davinci-003")
                .prompt(String.format("Translate from %s to %s:%s", languageStart, languageEnd, text)).build();
        Optional<String> bodyJson = Mapper.toJson(body);
        if (bodyJson.isEmpty()) {
            return null;
        }
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(bodyJson.get()))
                .header("Content-Type", "application/json")
                .header("Authorization", String.format("Bearer %s", Property.get("openia.token")))
                .build();
        Optional<HttpResponse<String>> responseOptional = send(request);
        if (responseOptional.isEmpty()) {
            return null;
        }
        return responseOptional.get().body();
    }

    private Optional<HttpResponse<String>> send(HttpRequest request) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, null, null);
            HttpClient client = HttpClient.newBuilder().sslContext(sslContext).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return Optional.of(response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException | KeyManagementException | InterruptedException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
