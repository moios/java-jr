package dia4;

public class CalculadoraSimple {
	//atributos
	float num1,num2;
	//constructor
	public CalculadoraSimple() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	//metodos
	public void cargarNumeros(float a, float b) {
		this.num1 = a;
		this.num2 = b;
	}
	
	public double sumar() {
		return this.num1 + this.num2;
	}
}
