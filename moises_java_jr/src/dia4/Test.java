package dia4;

public class Test {
	public static void main(String[] args) {
		
		CalculadoraSimple casio = new CalculadoraSimple();
		casio.cargarNumeros(10, 15);
		System.out.println(casio.sumar());
		}
}
