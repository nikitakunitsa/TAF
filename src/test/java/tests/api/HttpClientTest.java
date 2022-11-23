package tests.api;

import lombok.ToString;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpClientTest {
    @Test
    public void simleApiTest() throws IOException {
        String restUrl="https://reqres.in";

        HttpUriRequest request= new HttpGet(restUrl);

        HttpResponse httpResponse= HttpClientBuilder
                .create()
                .build()
                .execute(request);

        System.out.println(request.toString());

        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
    }
}
