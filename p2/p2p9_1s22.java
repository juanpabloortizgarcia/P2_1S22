import java.util.Scanner;
public class p2p9_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] Ma, Mb, Mc;
		int f,c,i,j;
		System.out.println("ingresa el tamaño de la matriz cuadratica");
		f = teclado.nextInt();
		if (f>0){
			c=f;
			Ma = new int[f][c];
			Mb = new int[f][c];
			Mc = new int[f][c];
			System.out.println("valor f"+f+" valor para c "+ c);
			for (i=0;i<f ; i++){
				for (j=0;j<c ; j++){
					System.out.println("ingrese el valor para la matriz A["+i+"]["+j+"]: ");
					Ma[i][j]=teclado.nextInt();
				}
			}
			for (i=0;i<f ; i++){
				for (i=0; i<c ; j++){
					System.out.println("ingreses el valor para la matriz B["+i+"]["+j+"]: ");
					Mb[i][j]=teclado.nextInt();
				}
			}
			for (i=0;i<f ; i++){
				for(j=0;i<f ; i++){
					Mc[i][j]=Ma[i][j]+Mb[i][j];
				}

			}
			}

		}
	}

