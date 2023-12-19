package BuscaminasProyecto;

import java.util.Scanner;
import java.util.Random;

public class buscaminass {

	public static int [] [] generarTablero(int filas, int columnas) {
        
        int[][] tableroNivel = new int[filas][columnas];
        
        for (int i = 0; i < tableroNivel.length; i++) {
            
             for (int j = 0; j < tableroNivel[i].length; j ++) {
    
             }
        }
        return tableroNivel;
        
    }
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("¡Bienvenido al Buscaminas!");
		System.out.println("Las reglas son simples, deberá seleccionar la posición de una casilla del tablero para revelar su contenido. Si es una mina, explotará, si no es una mina, podrá seguir jugando");
		System.out.println("Presione 1, para el nivel fácil, 2 para el nivel intermedio, 3 para el nivel difícil o 4 para el nivel custom: ");
		int nivel = sc.nextInt();
		int minas;
		int filas;
		int columnas;
		int [][] tablero;
		
		
			do {
			
			System.out.println("Presione 1, para el nivel fácil, 2 para el nivel intermedio, 3 para el nivel difícil o 4 para el nivel custom: ");
			nivel = sc.nextInt();
			
			
			switch(nivel) {
				
				
			
					case 1:
								
							System.out.println(Arrays.deepToString(generarMinas(generarTablero(3,3), 3)));
							break;
					
					case 2:
					
							System.out.println(Arrays.deepToString(generarMinas(generarTablero(5,5), 8)));
							break;
							
					case 3:

					
							System.out.println(Arrays.deepToString(generarMinas(generarTablero(8,8), 15)));
							break;
							
					
					case 4:
			
					
							System.out.println("Introduce el número de filas : ");
							filas = sc.nextInt();
							
							
							System.out.println("Introduce el número de columnas : ");
							columnas = sc.nextInt();
							
							
							System.out.println("Introduce el número de minas : ");
							minas = sc.nextInt();
							
							System.out.println(Arrays.deepToString(generarMinas(generarTablero(filas,columnas), minas)));
							break;
				
					default : System.out.println("Selección incorrecta, intentelo de nuevo");
					break;
					}
			
			
			}while(nivel < 1 || nivel > 4);	
		
		sc.close();

	}

}
