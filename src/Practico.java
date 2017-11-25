import java.util.Scanner;

public class Practico {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		//paradigma estrucutrado Tipo y Variable
		int numero = 10; 
		//paradigma OO Clase y Objeto
		System.out.println("Escriba algo ..");
		
		Scanner teclado = new Scanner(System.in);
		
		String ingreso = teclado.nextLine();
		
		System.out.println("Hola mundo "+ingreso);
		
		/**
		 * Practica : Funciones y Procedimientos
		 */
		Operacion unPractico = new Operacion();
		
		//Función
		int resultado = unPractico.suma(1,2);
		
		System.out.println("El resultado de la suma como función es:" + resultado );
		
		//Procedimiento		
		unPractico.sumaSinRetorno(4,5);
		unPractico.sumaIngreso();
		
	}
	

}
