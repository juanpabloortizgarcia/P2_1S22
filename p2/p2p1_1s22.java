import java.util.Scanner;

public class p2p1_1s22{
	public static void main(String[] args){
		int opc = 3; 
		switch(opc){
		case 1: 
			System.out.println("Aqui estamos en la primera opcion");
			break;
		case 2:
			System.out.println("Aqui estamos en la segunda opcion");
			break;
		case 3:
			System.out.println("Aqui estamos en la tercera opcion");
			break;
		default:
			System.out.println("No existe el valor dentro ede los casos");

		}
		char opc1='a';
		switch(opc1){
		case 'a':
			System.out.println("seleccione A");
			break;
		case 'b':
			System.out.println("seleccione B");
			break;
		case 'c':
			System.out.println("seleccione C");
			break;
		default:
			System.out.println("no esta dentro de las opciones");
		}
		char opc2;
		Scanner teclado = new Scanner(System.in);

		opc2 = teclado.next().charAt(0);
		switch(opc2){
		case 's':
			System.out.println("aqui ira las operaciones de suma");
			break;
		case 'r':
			System.out.println("aqui ira las operacines de resta");
			break;
		case 'm':
			System.out.println("aqui ira las operaciones de multiplicacion");
			break;
		case 'd':
			System.out.println("aqui ira las operaciones de divicion");
			break;
		default:
			System.out.println("no existe operacion a realizar...");

		}
	}
}