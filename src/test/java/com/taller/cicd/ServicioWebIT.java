package com.taller.cicd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicioWebIT {
    @Test
    public void testConexionGoogle() throws Exception {
        URL url = new URL("https://google.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        assertTrue(status == 200, "Servicio de integracion OK");
    }
}
