package modelo;

import java.util.Scanner;

public class morse {
	
	String[] matrizMorse = new String [36];
	char[] matrizAbecedario = new char [36];
	
	public morse() {
		
		
		matrizMorse[0] = ".-";
		matrizMorse[1] = "-...";
		matrizMorse[2] = "-.-.";
		matrizMorse[3] = "-..";
		matrizMorse[4] = ".";
		matrizMorse[5] = "..-.";
		matrizMorse[6] = "--.";
		matrizMorse[7] = "....";
		matrizMorse[8] = "..";
		matrizMorse[9] = ".---";
		matrizMorse[10] = "-.-";
		matrizMorse[11] = ".-..";
		matrizMorse[12] = "--";
		matrizMorse[13] = "-.";
		matrizMorse[14] = "---";
		matrizMorse[15] = ".--.";
		matrizMorse[16] = "--.-";
		matrizMorse[17] = ".-.";
		matrizMorse[18] = "...";
		matrizMorse[19] = "-";
		matrizMorse[20] = "..-";
		matrizMorse[21] = "...-";
		matrizMorse[22] = ".--";
		matrizMorse[23] = "-..-";
		matrizMorse[24] = "-.--";
		matrizMorse[25] = "--..";
		matrizMorse[26] = ".----";
		matrizMorse[27] = "..---";
		matrizMorse[28] = "...--";
		matrizMorse[29] = "....-";
		matrizMorse[30] = ".....";
		matrizMorse[31] = "-....";
		matrizMorse[32] = "--...";
		matrizMorse[33] = "---..";
		matrizMorse[34] = "----.";
		matrizMorse[35] = "-----";
		
		
		matrizAbecedario[0] = 'a';
		matrizAbecedario[1] = 'b';
		matrizAbecedario[2] = 'c';
		matrizAbecedario[3] = 'd';
		matrizAbecedario[4] = 'e'; 
		matrizAbecedario[5] = 'f'; 
		matrizAbecedario[6] = 'g';
		matrizAbecedario[7] = 'h';
		matrizAbecedario[8] = 'i';
		matrizAbecedario[9] = 'j'; 
		matrizAbecedario[10] = 'k'; 
		matrizAbecedario[11] = 'l';
		matrizAbecedario[12] = 'm';
		matrizAbecedario[13] = 'n'; 
		matrizAbecedario[14] = 'o'; 
		matrizAbecedario[15] = 'p';
		matrizAbecedario[16] = 'q';
		matrizAbecedario[17] = 'r'; 
		matrizAbecedario[18] = 's'; 
		matrizAbecedario[19] = 't';
		matrizAbecedario[20] = 'u'; 
		matrizAbecedario[21] = 'v'; 
		matrizAbecedario[22] = 'w';
		matrizAbecedario[23] = 'x';
		matrizAbecedario[24] = 'y'; 
		matrizAbecedario[25] = 'z'; 
		matrizAbecedario[26] = '1'; 
		matrizAbecedario[27] = '2';
		matrizAbecedario[28] = '3'; 
		matrizAbecedario[29] = '4'; 
		matrizAbecedario[30] = '5'; 
		matrizAbecedario[31] = '6';
		matrizAbecedario[32] = '7'; 
		matrizAbecedario[33] = '8'; 
		matrizAbecedario[34] = '9'; 
		matrizAbecedario[35] = '0';	
	}
	
	
	
	public  String espAmorse(String palabra) {
	
	char letra;
	String palabraMorse = "";
	for(int i=0; i<palabra.length(); i++) {
		letra = palabra.charAt(i);
		for(int e=0; e<matrizAbecedario.length; e++) {
			if(letra == matrizAbecedario[e]) {
				palabraMorse += matrizMorse[e] + " ";
			}
		}
	}
	return palabraMorse;
	}
	
	public String morseAesp(String palabra) {
		
		String letraM;
		String[] letraMorse = palabra.split(" ");
		String palabraEsp = "";
		//el primer for es para leer la longitu y comprobar el primer caracter con todo el abecedario
		for(int i=0; i<letraMorse.length; i++) {
			letraM = letraMorse[i];
			for(int e=0; e<matrizMorse.length; e++) {
				if(letraM.equals(matrizMorse[e])){
					palabraEsp += matrizAbecedario[e];
				}
			}
		}
		return palabraEsp;
	}
	
	public String opciones(int respuesta, String palabra) {
		String reps = "";
		switch(respuesta) {
		case 1:
			reps = espAmorse(palabra);
			break;
		case 2:
			reps = morseAesp(palabra);
			break;
		default:
			
		}
		return reps;
		
	}


}
