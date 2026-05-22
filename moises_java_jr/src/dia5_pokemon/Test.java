package dia5_pokemon;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//Crear los pokemones
		Tipo tipo = new Tipo();
		tipo.setTipo("electrico");
		Pokemon pikachu = new Pokemon(tipo, "PIKACHU",100, 20, 15,4);
		
		tipo.setTipo("fuego");
		Pokemon charmander = new Pokemon(tipo, "CHARMANDER",80, 15, 12,3);
		
		Combate torneo_esmeralda = new Combate(pikachu, charmander);
		
		torneo_esmeralda.iniciar();
		
	}
}
