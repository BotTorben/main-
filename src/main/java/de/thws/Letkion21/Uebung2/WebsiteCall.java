package de.thws.Letkion21.Uebung2;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.TimeUnit;

public class WebsiteCall {

    public static void main(String[] args) {
        Response response = ClientBuilder.newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()
                .target("https://jsonplaceholder.typicode.com/")
                .path("posts/1")
                .request(MediaType.APPLICATION_JSON)
                .get();
        String s = response.readEntity(String.class);
        System.out.println(s);
    }

}
