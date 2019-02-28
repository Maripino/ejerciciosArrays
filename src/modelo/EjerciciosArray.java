package modelo;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjerciciosArray {

	// Ejercicio 1 metodo rellenar array

	public int[] rellenarArray() {

		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {

			System.out.println("Introducir un número para la posición: " + i);
			array[i] = scanner.nextInt();
		}

		scanner.close();

		return array;

	}

	public void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println("Número de la posición " + i + ":" + array[i]);

		}

	}
	
	//Ejercicio 1 Crea un array de 10 posiciones de números con valores pedidos por teclado
	
	 //Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, 
	//uno para rellenar valores y otro para mostrar.
	
	public int[] rellenarArray2() {
		
		int[] array = new int[10];  // se crea unn array de tipo int posicion 10
		Scanner scanner = new Scanner(System.in); // lo mostramos por consola
		
		for(int i=0; i < array.length; i++) { //se itera, recorre el largo del array
				
		System.out.println("Introducir un número para la posición: " + i); //el mensaje que se muestra
		array[i] = scanner.nextInt(); // lo que cotiene [i] scanner.next.Int lo retorna a numero entero
					
		}
		scanner.close();
		
		return array;
		
	}
	
	public void mostrarArray2(int[]array) { // mostrar array2 y le pasamos parametro tipo int[]array
		
		
		for(int i=0; i < array.length; i++) {
			
			System.out.println("Numero de la posición " + i + ":" + array[i]);
			
		}
		
	}
	// Ejercicio 2 ArrayNumeros

	public int[] ArrayNumerosAleatorios(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la longitud del array:");
		int longitud = scanner.nextInt();

		int[] array = new int[longitud];

		for (int i = 0; i < array.length; i++) {
			array[i] = generaNumAleatorio(a, b);

		}
		scanner.close();
		
		return array;
	}

	public void mostrarSumarArray(int[] array) {
		int sumando = 0;
		for (int i = 0; i < array.length; i++) {

			sumando += array[i];
			System.out.println("Número de la posición " + i + ":" + array[i]);

		}

		System.out.println("La suma total del array: " + sumando);
	}
	
	
	// ejercicio 2 repeticion ArrayNumeros
	// Crea un array de números donde le indicamos por teclado el tamaño del array,
	//rellenaremos el array con números aleatorios entre 0 y 9, 
	
	public int[] ArrayNumerosAletorios2( int a, int b) {
		
		Scanner scanner = new Scanner(System.in); // creacion scanner
		 System.out.println("Introduce la longitud del array:");  //mostrar
		 
		 int longitud = scanner.nextInt();//  tamaño de la longitud del array, pssamos a int
		 
		 int[] array = new int[longitud]; // creacion del array guardar longitud
		 
		 for(int i=0; i < array.length; i++) {
			 
			 array[i] = generaNumAleatorio(a, b);
			 
			}
			scanner.close();
		 
			return array;
		}
	
	public void mostrarSumaArray2(int[]array) {
	
		int sumando =0;
		for (int i=0; i < array.length; i++) {
			
			 sumando += array[i]; 
			 
			 System.out.println("Número de la posición: " + i + ":" + array[i]);
		}
		
		System.out.println("La suma del total del array: " + sumando);
	}
	
	

	
	
	// Ejercicio 3 crear array numeros
	
	public int[] arrayPrimosAleatorios(int a, int b) {
		
		int longitud=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud: "));
		
		int[] arrayPrimos= new int[longitud];  // la longitud el numero de elementos
		
		int numero; // ese es el numero generado aleatoriamente
		int i=0;
		while(i < arrayPrimos.length) {
			
			 numero=generaNumAleatorio(a, b);
			if (esPrimo(numero)){
				
				arrayPrimos[i]= numero; // el primo se guarda en la posicion i del array
				i++;
				
			}
			
		}
		int mayor = devolverNumeroMayor(arrayPrimos);//llamada desde el metodo
		System.out.println("El número mayor del array es: " + mayor);
		return arrayPrimos;
		
	}
	
		// crear un metodo que devuelva el numero mayor
		
		public int devolverNumeroMayor (int[] array) {
			int mayor=0;
			
			for(int i=0; i < array.length; i++) {
				
				if(array[i] > mayor) {
					mayor= array[i];
									
				}
										
			}
			return mayor;
			
		}		
		
	public boolean esPrimo(int n) {
		
		for(int i=2; i < n; i++) {
			if(n%i==0) {
				
				return false;
			}
			
		}
		return true;
	}

	private int generaNumAleatorio(int a, int b) {
		int numero = ((int) Math.floor(Math.random() * (a - b) + b));
		return numero;
	}
	
	// EJERCICIO 3 REPETICION
	
	public int[] arrayPrimosAleatorios2(int a, int b) {
		
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud"));
		
		int[] miArrayPrimos = new int[longitud];
		
		int numero; // este es el numero que genera aleatorio
		int i=0; // iniciamos variable while
		
		while(i > miArrayPrimos.length ) {
			
			numero = generaNumAleatorio(a, b);
			if(esPrimo (numero));
			miArrayPrimos[i] = numero; // el numero primo s guarda en la posicion i
			i++;
			
		}
		
		int mayor = devolverNumeroMayor(miArrayPrimos);
		System.out.println("El número mayor es: " + mayor);
		return miArrayPrimos;
		
		}
	
	// crear un metodo que devuelva el numero mayor repetido
	
	public int devolverNumeroMayor2(int[] array) {
		
		int mayor=0;
		
		for(int i=0; i < array.length; i++ ) {
			
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
		
	}
	
	public boolean esPrimo2(int n) {
		
		for(int i=2; i < n; i++) {
			
			if(n%i == 0) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	//Ejercicio 4
	
	public int[] numerosPosicion (int a, int b) {
		
		int[] numerosTotal = new int[b-a +1];
		int sumando=0;
		for(int i=0; i < numerosTotal.length; i++) {
			
			numerosTotal[i]= a + i;
			sumando += numerosTotal[i];
		}
		
		System.out.println("La suma total: " + sumando);
		
		
		float media= sumando/numerosTotal.length;
		
		System.out.println("La media del array es: " + media);
		
		return numerosTotal;
	}
	
	//ejercicio 5 disco duro de roer
	
	public char[] pasarCaracteresArray() {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce una frase");
		
		String cadena= scanner.nextLine();
		
		char[] caracteres= new char[cadena.length()];
		for(int i=0; i < cadena.length(); i++) {
		
			caracteres[i]= cadena.charAt(i);
							
		}
		
		return caracteres;
		
		
	}
	
	
	
	
	
			
	//Ejercicio 5 propios inventados por Byron
	
	public boolean sonIguales (int[]array1, int[]array2) {
		
		if(array1.length==array2.length) { // si las longitudes sonn iguales
			
			for(int i=0; i < array1.length; i++) {  // for para recorrer los dos arrays
				if(array1[i] != array2[i]) { // se comprueba cada elemento de los dos arrays
				// si encuentras alguna diferencia devuelve false	
				return false;	
				}
			}
			
			// los dos arrays son iguales
			return true;
		
		}
		else {
			// si las longitudes no son iguales devuelve false
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
