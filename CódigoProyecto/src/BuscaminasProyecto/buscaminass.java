package BuscaminasProyecto;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class buscaminass {

	
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("¡Bienvenido al Buscaminas!");
		System.out.println("Las reglas son simples, deberá seleccionar la posición de una casilla del tablero para revelar su contenido. Si es una mina, explotará, si no es una mina, podrá seguir jugando");
		int minas;
		int filas;
		int columnas;
 HEAD
		int nivel;
		int contadorVidas;
		int i, j;

		int [][] tablero;
		int i, j,contadorVidas;
		int [][] tablaMinas;
			

		
			do {
			
			System.out.println("Presione 1, para el nivel fácil, 2 para el nivel intermedio, 3 para el nivel difícil o 4 para el nivel custom: ");
			nivel = sc.nextInt();
			
			
			switch(nivel) {
				
				
			
					case 1:
<<<<<<< HEAD
						pintaMatriz(3, 3);
							break;
					
					case 2:
					
							//System.out.println(Arrays.deepToString(generarMinas(generarTablero(5,5), 8)));
							pintaMatriz(5, 5);
							break;
=======

							tablaMinas = generarMinas(generarTablero(3,3),3);
						
                        contadorVidas = 5;
                        
                        pintaMatriz(3, 3);
                        
                    do {
                    	
                        System.out.println("Introduce la primera coordenada:");
                        i = sc.nextInt();
                        
                        System.out.println("Introduce la segunda coordenada:");
                        j = sc.nextInt();

                        if( compruebaMinas(i, j, tablaMinas) == true ) {
                        	
                            contadorVidas --;
                            
                            System.out.println("Boom, ha perdido una vida");
                            
                        }else {
                        	
                        	
                            System.out.println("Continúa");
                        }
                        

                    }while(contadorVidas != 0);


                            break;
                            
					case 2:
					
						tablaMinas = generarMinas(generarTablero(5,5),8);
						
                        contadorVidas = 7;
                        
                        pintaMatriz(5, 5);
                        
                    do {
                    	
                        System.out.println("Introduce la primera coordenada:");
                        i = sc.nextInt();
                        
                        System.out.println("Introduce la segunda coordenada:");
                        j = sc.nextInt();

                        if( compruebaMinas(i, j, tablaMinas) == true ) {
                        	
                            contadorVidas --;
                            
                            System.out.println("Boom, ha perdido una vida");
                            
                        }else {
                        	
                        	
                            System.out.println("Continúa");
                        }
                        

                    }while(contadorVidas != 0);


                            break;


>>>>>>> testManuel
							
					case 3:

					
							//System.out.println(Arrays.deepToString(generarMinas(generarTablero(8,8), 15)));
							pintaMatriz(8, 8);
							break;
							
							
					
					case 4:
			
					
							System.out.println("Introduce el número de filas : ");
							filas = sc.nextInt();
							
							
							System.out.println("Introduce el número de columnas : ");
							columnas = sc.nextInt();
							
							
							System.out.println("Introduce el número de minas : ");
							minas = sc.nextInt();
							
							System.out.println(Arrays.deepToString(generarMinas(generarTablero(filas,columnas), minas)));
							pintaMatriz(filas, columnas);
							break;
				
					default : System.out.println("Selección incorrecta, intentelo de nuevo");
					break;
					}
			
			
			}while(nivel < 1 || nivel > 4);	
		
		sc.close();

	}

		public static int [] [] generarTablero(int filas, int columnas) {
			int[][] tableroNivel = new int[filas][columnas];
			for (int i = 0; i < tableroNivel.length; i++) {
				 for (int j = 0; j < tableroNivel[i].length; j ++) {
				 }		
		}
			return tableroNivel;
			
		}
		
<<<<<<< HEAD
		//Manu
=======
		
		
		
		
		
		
			
		
>>>>>>> testManuel
		public static int [] [] generarMinas(int [][] generarTablero , int minas) {
			Random random = new Random();
			int [][] tablaMinas = generarTablero;

			int contadorminas = 0;
					 do {		
						int i1 = (int)(Math.random() * tablaMinas.length);
						int j1 = (int)(Math.random() * tablaMinas[i1].length);
							 if(tablaMinas[i1][j1] == 0){ 
								tablaMinas[i1][j1] = 1;
								contadorminas++;
							 }
					}while(contadorminas < minas);
		return tablaMinas;
		}
		
<<<<<<< HEAD

	public static char[][] pintaMatriz(int filas, int columnas){
		char[][] tableroPintado = new char[filas][columnas];
		for(int i=0; i< tableroPintado.length; i++){
			 System.out.println();
			for(int j=0; j< tableroPintado[i].length; j++){
				tableroPintado[i][j] = 'x' ;
				 System.out.print(tableroPintado[i][j] + " ");       
			}
		}

		return tableroPintado;

	}
	
}
=======
		
	public static boolean compruebaMinas(int fila ,int columna, int [][] generarMinas){
		
		boolean explota = false;
		
				
				if (generarMinas[fila][columna] == 1) {
					
					
					explota = true ;
					
				} 
				
				return explota;
			}

>>>>>>> testManuel
