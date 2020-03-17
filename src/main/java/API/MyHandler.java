package API;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

class MyHandler implements HttpHandler {
	APIConnection api=new APIConnection("https://restcountries.eu/rest/v2/name/egypt?fields=name;capital;currencies");
	
        public void handle(HttpExchange t) throws IOException {
            String response =api.getCountryInfoFromOnlineApi().toString();
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }