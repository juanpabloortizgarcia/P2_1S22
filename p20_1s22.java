import java.util.Scanner;
import java.lang.Math;

public class p20_1s22{

	public static void main(String[] args) {
		
		java.util.Scanner teclado = new Scanner (System.in);
double radio;
double area;
double longitud;
System.out.println(" calcula el area y longitud");
System.out.println("Escribe un radio:");
radio= teclado.nextInt();
area = Math.PI*Math.pow(radio,2);
// area = PI*r^2
longitud = 2*Math.PI*radio;
System.out.println("el resultado del area es: "+ longitud);

	}
}