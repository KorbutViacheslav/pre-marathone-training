package org.example;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World from sprint09!");

        var url = new URL("file:E:\\JAVA\\projekt\\pre-marathone-training\\pre-marathone-training\\sprint09\\src\\main\\java\\org\\example\\Priority.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }
}
