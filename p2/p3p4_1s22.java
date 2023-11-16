import java.util.Scanner;
public class p3p4_1s22{
	public static int alcuadrado(in pasada,int valor, int limite){
		if(pasada == limite){
			return valor;		}
		return alcuadrado(pasada + 1, valor * 2 , limite);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(ingrese el numero de potencia de 2 que deseea calcular);
		int limite = alcuadrado scanner.nextInt();
		int resultado = alcuadrado(1,2,limite);
		System.out.println("potencia de 2 deseada: " + resultado);
	}

}