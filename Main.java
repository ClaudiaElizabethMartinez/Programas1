package modelo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int respuesta;
		String palabra;
		String traduccion;
		String continuar;
		boolean bandera = true;
		morse codigo = new morse();
		while(bandera) {
			System.out.println("Elige una opcion: \n "
					+ "1.- Espa�ol a Codigo Morse\n"
					+ "2.- Codigo Morse a Espa�ol");
			respuesta = entrada.nextInt();
			System.out.println("Ingrese la palabra: ");
			palabra = entrada.next();
			traduccion = codigo.opciones(respuesta, palabra);
			System.out.println("La palabra : " + palabra + " se tradujo: " + traduccion);
			System.out.println("Desea hacer otra traduccion? s/n" );
			continuar = entrada.next();
			if(continuar != "s") {
				bandera = false;
			}
			
		}
		
	}
		


	}


