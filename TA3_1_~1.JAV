package Trabajos_Autonos_De_Luis_Gonzalez;

import java.util.Scanner;

public class TA3_1_Generar_un_vector_de_N_n�meros_enteros_aleatorios_entre_0_y_100_Recorra_el_vector_y_clasifique_en_dos_grupos_n�meros_primos_y_n�meros_compuestos_Presente_todos_los_elementos_del_vector_y_los_dos_grupos_de_n�meros {

	/**
	 * @param Generar un vector de N n�meros enteros aleatorios entre 0 y 100. Recorra el vector y clasifique en dos grupos: n�meros primos y n�meros compuestos Presente todos los elementos del vector y los dos grupos de n�meros
	 */
	public static void main(String[] args) {

		System.out.println("Imprimir n numeros aleatorio y agruparlos. ");
		System.out.println("Elaborado por Luis Gonz�lez (UWU)");
		System.out.print("Ingrese un valor: ");

		Scanner Entrada = new Scanner(System.in);
		int n;
		int cont=0;
		int cont1=0;
		do{
			try{
				n=Entrada.nextInt();
				if(n<=0) throw new RuntimeException("Error");
				break;
			}
			catch (Exception error) {
				System.out.println("Error, ingrese un valor posivtivo y que sea entero");
				Entrada.nextInt();
			}
		}while(true);

		int [] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i]=(int)(Math.random() * 15+0);
			System.out.println(" " + v[i]);
		}
		for (int i = 0; i < n; i++) {
			int num=0;
			for (int j = 2; j < v[i]/2; j++) {
				if(v[i]%j==0){
					num++;
				}
			}
		if (num==0){
			System.out.println("Primo: " + v[i]);
			cont++;
		}else {
			System.out.println("Compuesto: "+v[i]);
			cont1++;
			}
		}
	}
}

