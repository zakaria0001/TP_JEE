package org.example.Server;

import jakarta.xml.ws.Endpoint;
import org.example.webservice.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {

        var address = "http://0.0.0.0:9191/";

        // Endpoint.publish("http://localhost:9191/" ..... demarrer le serveur http avec le port 9191 pour publier le web service mais le web service sera accessible que par localement (localhost)
        // to make it accessible from outside, we need to use a public IP address instead of localhost like this: 0.0.0.0

        Endpoint.publish(address, new BanqueService());
        System.out.println("Server is running on " + address + " ...");

    }

}
