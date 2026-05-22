package dia2;

public class Jaha {
	public static void main(String[] args) {
		String tipoPasajero = "e"; //p..e
		int saldo = 1300;
		if(tipoPasajero == "p") {
			if(saldo >= 3600) {
				saldo = saldo - 3600;
				System.out.println("Pasaje pagado");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else if(tipoPasajero == "e") {
			if(saldo >= 1300) {
				saldo -= 1300;
				System.out.println("Pasaje pagado");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}
		System.out.println("Saldo actual: " + saldo);
		
		
	}
}
