package lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {

	public static void main(String[] args) {
		int maiorNro = 0;
		int menorNro = 1;
		int media = 0;
		System.out.println("Digite 10 Numeors Inteiros e Diferentes:\n");
		
		List listaNumeros = new ArrayList(); 
		for (int i = 0; i < 10; i++) {
			Scanner ler = new Scanner(System.in);
			int numero = ler.nextInt();
			media = media +numero;
			listaNumeros.add(numero);
			if(numero < menorNro){
				menorNro = numero;
			}
			if(numero > maiorNro ){
				maiorNro = numero;
			}
			
		}
		int mediaFinal = media /10;
		System.out.println("média aritmética" +mediaFinal);
		System.out.println(listaNumeros);
		System.out.println("Maior Numero"+maiorNro);
		System.out.println("Menor Numero"+menorNro);
		System.out.println("Numero acima de 10");
		System.out.println("Numero acima de 50");
	}

}
