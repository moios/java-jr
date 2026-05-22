package dia2;

public class NumeroPrimo {
	public static void main(String[] args) {
		double numero = 1000000000;
		boolean esPrimo;
		while(true) {
			esPrimo = true;
			for(int x = 2 ; x < (int)numero/2 ; x++) {
				if(numero % x == 0) {
					//no es primo
					esPrimo = false;
					break;
				}
			}
			if(esPrimo) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
