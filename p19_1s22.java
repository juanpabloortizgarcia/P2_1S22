import java.util.Scanner;
import java.lang.Math;

public class p19_1s22{

 public static void main(String[] args) {
 	java.util.Scanner teclado = new Scanner (System.in);
 	 double a;
 	 double b = 1.33;
 	 double resultado;
 	 System.out.println("Escriba un radio: ");
 	 a=teclado.nextInt();
 	 resultado= b*Math.PI*Math.pow(a,3);
 	 //volumen =(4/3)*PI*(r^3)
 	 System.out.println("el valor del volumen es: + resultado");

 	 } 

 	 }
 