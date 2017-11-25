import java.util.Scanner;

public class Operacion {
	//ejemplo de función
	public int suma(int op1, int op2) {
		return op1 + op2;
	} 
	//ejemplo de procedimiento
	public void sumaSinRetorno(int op1, int op2) {
		int resultado = op1 + op2;
		System.out.println("el resultado de la suma es:"+ resultado);
	}
	public void sumaIngreso() {
		int resultado;
		int op1,op2;

		Scanner teclado = new Scanner(System.in);	

		System.out.println("Ingrese operando 1:");
		op1 = teclado.nextInt();

		System.out.println("Ingrese operando 2:");
		op2 = teclado.nextInt();
		
		resultado = op1 + op2;
		System.out.println("El resultado es: "+resultado);
		teclado.close();
	}
	public float raizCuadrada(float radicando) {
		return (float) Math.sqrt(radicando);
	}
}
