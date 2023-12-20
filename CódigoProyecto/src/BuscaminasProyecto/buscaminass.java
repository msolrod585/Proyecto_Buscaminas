package BuscaminasProyecto;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class buscaminass {
var sc = new Scanner(System.in);
		System.out.println("¡Bienvenido al Buscaminas!");
		System.out.println("Las reglas son simples, deberá seleccionar la posición de una casilla del tablero para revelar su contenido. Si es una mina, explotará, si no es una mina, podrá seguir jugando");
		int minas;
		int filas;
		int columnas;
		int nivel;
		int i, j,contadorVidas;
		int sinBombas = 0;
		int [][] tablaMinas;
			

		
			do {
			System.out.println("Presione 1, para el nivel fácil, 2 para el nivel intermedio, 3 para el nivel difícil o 4 para el nivel custom: ");
			nivel = sc.nextInt();
			
			switch(nivel) {

					case 1:
						tablaMinas = generarMinas(generarTablero(3,3),3);
                        contadorVidas = 3;
                        pintaMatriz(3, 3);
                    do {
                        System.out.println("\nIntroduce la primera coordenada:");
                        i = sc.nextInt();
                        
                        System.out.println("Introduce la segunda coordenada:");
                        j = sc.nextInt();

                        if( compruebaMinas(i, j, tablaMinas) == true ) {
                            contadorVidas --;
                            System.out.println("Boom, ha perdido una vida");
                        }else {
                            System.out.println("Continúa");
                            sinBombas ++; 
                        }
                       System.out.println("["+i+"]"+"["+j+"]");
                       
                    }while(contadorVidas != 0 && sinBombas <= 6 );
			                    if(sinBombas == 6){
			            			System.out.println("Has Ganado!");
			            		}else if(contadorVidas == 0) {
			            			System.out.println("Te has quedado sin vidas. Has perdido");
			            		}
                            break;
                          
					case 2:
						tablaMinas = generarMinas(generarTablero(5,5),8);
                        contadorVidas = 7;
                        pintaMatriz(5, 5);
                        
                    do {
                        System.out.println("\nIntroduce la primera coordenada:");
                        i = sc.nextInt();
                        
                        System.out.println("Introduce la segunda coordenada:");
                        j = sc.nextInt();

                        if( compruebaMinas(i, j, tablaMinas) == true ) {
                            contadorVidas --;
                            System.out.println("Boom, ha perdido una vida");
                        }else{
                            System.out.println("Continúa");
                            sinBombas ++; 
                        }
                       System.out.println("["+i+"]"+"["+j+"]");
                       
                    }while(contadorVidas != 0 && sinBombas < 17 );
		                    if(sinBombas == 17){
		            			System.out.println("Has Ganado!");
		            		}else if(contadorVidas == 0) {
		            			System.out.println("Te has quedado sin vidas. Has perdido");
		            		}
                            break;

					case 3:
							pintaMatriz(8, 8);
							
							tablaMinas = generarMinas(generarTablero(8,8),15);
	                        contadorVidas = 13;
	                        pintaMatriz(8, 8);
	                        
	                    do {
	                    	
	                        System.out.println("\nIntroduce la primera coordenada:");
	                        i = sc.nextInt();
	                        
	                        System.out.println("Introduce la segunda coordenada:");
	                        j = sc.nextInt();

	                        if( compruebaMinas(i, j, tablaMinas) == true ) {
	                            contadorVidas --;
	                            System.out.println("Boom, ha perdido una vida");
	                        }else{
	                            System.out.println("Continúa");
	                            sinBombas ++; 
	                        }
	                       System.out.println("["+i+"]"+"["+j+"]");
	                       
	                    }while(contadorVidas != 0 && sinBombas < 49 );
			                    if(sinBombas == 49){
		                			System.out.println("Has Ganado!");
		                		}else if(contadorVidas == 0) {
			            			System.out.println("Te has quedado sin vidas. Has perdido");
			            		}
	                            break;
	                            
					case 4:
			
							System.out.println("\nIntroduce el número de filas : ");
							filas = sc.nextInt();
							System.out.println("Introduce el número de columnas : ");
							columnas = sc.nextInt();
							System.out.println("Introduce el número de minas : ");
							minas = sc.nextInt();
							
							tablaMinas = generarMinas(generarTablero(filas,columnas),minas);
	                        contadorVidas = (int)(Math.random() * 21);
	                        pintaMatriz(filas,columnas);
	                        System.out.println("En este nivel tienes: " + contadorVidas +" vidas.");
							
	                    do {
	                        System.out.println("Introduce la primera coordenada: ");
	                        i = sc.nextInt();
	                        System.out.println("Introduce la segunda coordenada: ");
	                        j = sc.nextInt();

	                        if( compruebaMinas(i, j, tablaMinas) == true ) {
	                            contadorVidas --;
	                            System.out.println("Boom, ha perdido una vida");
	                        }else{
	                            System.out.println("Continúa");
	                            sinBombas ++; 
	                        }
	                       System.out.println("["+i+"]"+"["+j+"]");
	                       
	                    }while(contadorVidas != 0  &&  sinBombas < (filas*columnas) - minas );
	                    		if(sinBombas == ((filas*columnas) - minas)){
	                    			System.out.println("Has Ganado!");
	                    		}else if(contadorVidas == 0) {
			            			System.out.println("Te has quedado sin vidas. Has perdido");
			            		}
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
		

		public static int [] [] generarMinas(int [][] generarTablero , int minas) {
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
	

		
	public static boolean compruebaMinas(int fila ,int columna, int [][] generarMinas){
		boolean explota = false;
			if (generarMinas[fila][columna] == 1) {
					explota = true ;
				}
			return explota;
		  }
   }
