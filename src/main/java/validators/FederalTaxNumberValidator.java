package validators;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FederalTaxNumberValidator {

    public static boolean isValidFederalTaxNumber(String federalTaxNumber, String birthDay) {
        return isSuccessRequest(federalTaxNumber, birthDay);
    }

    private static boolean isSuccessRequest(String federalTaxNumber, String birthDay) {
        HttpResponse<String> response;

        try {
            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://api.nfse.io/NaturalPeople/Basicinfo/taxNumber/" + federalTaxNumber + "/" + birthDay))
                    .header("content-type", "application/json")
                    .build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException("Failed request!");
        }

        return response.statusCode() == 200 ? true : false;
    }
}
