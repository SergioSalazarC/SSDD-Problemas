package paqueteEco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteEco1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",2000);
            PrintWriter escribirServidor = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader leerServidor = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String linea = teclado.readLine();
            while(!(linea.equals("x"))) {
                escribirServidor.println(linea);
                System.out.println("eco:" + leerServidor.readLine());
                linea = teclado.readLine();
            }

            escribirServidor.close();
            leerServidor.close();
            teclado.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
