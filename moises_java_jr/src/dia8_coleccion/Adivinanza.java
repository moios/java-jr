package dia8_coleccion;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numeroSecreto = random.nextInt(100) + 1 ;
		int intento;
		int intentosRealizados = 0;
		System.out.println("Bienvenido al juego de adivinanza");
		System.out.println("Adivina el número: ");
		do {
			System.out.println("Elige: ");
			intento = scanner.nextInt();
			intentosRealizados++;
			if(intento > numeroSecreto) {
				System.out.println("Alto");
			}else if(intento < numeroSecreto) {
				System.out.println("Bajo");
			}else {
				System.out.println("Acertaste es el " + numeroSecreto);
			}
		}while(intento != numeroSecreto);
		System.out.println("Acertaste en el intento " + intentosRealizados);
	}
}







