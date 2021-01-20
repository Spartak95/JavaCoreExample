package chat.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8000)) {
                System.out.println("Սերվեր լսում է");
                Socket connection = server.accept();
                InputStreamReader reader = new InputStreamReader(connection.getInputStream());
                int s = 0;
                while ((s = reader.read()) != 0) {
                    System.out.print((char) s);
                }
                String str = "Սերվերը բարևում է";
                OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
                writer.write(str);
                writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
