import java.util.Scanner;
import java.lang.Math;

public class p18_1s22{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double resultado;
		System.out.println("calcular el angulo en  radianes");
		System.out.println("introducir un agulo:");
		a = teclado.nextInt();
		resultado = Math.PI*a/180;
		// radieanes = a*PI/180
		System.out.println("el resultado en radianes es: "+ resultado);
	}

}