package chat.example;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket client = new Socket("localhost", 8000)) {
            String str = "Հաճախորդը բարևում է";
            OutputStreamWriter writer = new OutputStreamWriter(client.getOutputStream());
            writer.write(str);
            writer.flush();
            InputStreamReader reader = new InputStreamReader(client.getInputStream());
            int s = 0;
            while ((s = reader.read()) != 0) {
                System.out.print((char) s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
