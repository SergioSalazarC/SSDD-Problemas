package paqueteEco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEco extends java.lang.Thread{
	
	protected Socket socketDatos;
	
	private ServidorEco(Socket clientsoc) {
		socketDatos = clientsoc;
		start();
	}
	
	public void run() {
		System.out.println("lanzado nuevo thread");		
		try {
			PrintWriter escribirCliente = new PrintWriter(socketDatos.getOutputStream(),true);
			BufferedReader leerCliente = new BufferedReader(new InputStreamReader( socketDatos.getInputStream()));
			String linea;
			while ((linea = leerCliente.readLine()) != null){
			System.out.println ("Server: " + linea);
			escribirCliente.println(linea);
			if (linea.equals("x")) break;
			}
			socketDatos.close();
			escribirCliente.close();
			leerCliente.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		ServerSocket socketServidor = null;
		
		try {
			socketServidor = new ServerSocket(2000);
			System.out.println("Creado el socket del servidor");
			while(true) {
				System.out.println("Esperando conexion");
				new ServidorEco(socketServidor.accept());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	
	
	

	
	
	
}


