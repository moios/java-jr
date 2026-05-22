package dia5_pokemon;

public class Pokemon {
	//atributos
	Tipo tipo;
	String nombre;
	int nivelVida;
	int poderAtaque;
	int poderDefensa;
	int velocidad;
	//constructores
	public Pokemon() {}
	public Pokemon(Tipo tipo, String n, int nv, int pa, int pd, int v) {
		this.tipo = tipo;
		this.nombre = n;
		this.nivelVida = nv;
		this.poderAtaque = pa;
		this.poderDefensa = pd;
		this.velocidad = v;
	}
	
	public int atacar() {
		int a =  (int)Math.random() * 100 % this.poderAtaque +1 ;
		return a;
	}
	
	public boolean esquivar() {
		//1 es esquivar y 0 es recibir
		int a = (int)(Math.random() * 100) % 2;
		if(a == 0) {
			return true;
		}else {
			return false;
		}
	}
	public void setVida(int v) {
		this.nivelVida = v;
	}
	
	public int getVida() {
		return this.nivelVida;
	}
	
	
	
	
	
	
	
	
	
}
