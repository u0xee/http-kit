package org.httpkit.server;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.TreeMap;

import org.httpkit.ws.WSFrame;

class SingleThreadHandler implements IHandler {

    public static final String body = "Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.Run the script below in the context of a web page and click on the page once. You'll see a message popping up in a second. If you keep clicking on the page once in a second, the alert never appears.";

    public void handle(HttpRequest request, ResponseCallback cb) {
        Map<String, Object> header = new TreeMap<String, Object>();
        header.put("Connection", "Keep-Alive");
        ByteBuffer[] bytes = ClojureRing.encode(200, header, SingleThreadHandler.body);
        cb.run(bytes);
    }

    public void close() {

    }

    public void handle(AsyncChannel con, WSFrame frame) {

    }
}

public class SingleThreadHttpServerTest {
    public static void main(String[] args) throws IOException {
        // concurrency 1024, 2000000 request, time: 16545ms; 120882.44 req/s;
        // receive: 93M data; 5.62 M/s
        HttpServer server = new HttpServer("0.0.0.0", 9091, new SingleThreadHandler(), 20480,
                2048);
        server.start();

        // 2012/11/28
        // ab -k -n 2000000 -c 1000 http://127.0.0.1:9091/
        // 37341.30 req/s
        // concurrency 1024, 2000000 request, time: 52086ms; 38398.03 req/s;
        // receive: 27317M data; 524.46 M/s
        // concurrency 1024, 2000000 request, time: 17340ms; 115340.25 req/s;
        // receive: 139M data; 8.02 M/s
    }
}
