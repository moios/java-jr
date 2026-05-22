package dia5_pokemon;

import java.util.Random;

public class Combate {

	Pokemon p1, p2;
	
	public Combate(Pokemon a, Pokemon b) {
		this.p1 = a;
		this.p2 = b;
	}
	
	public void iniciar() throws InterruptedException {
		Random r = new Random();
		int turno = r.nextInt(1,3);
		while(true) {
			System.out.println(p1.nombre + ": " + p1.nivelVida);
			System.out.println(p2.nombre + ": " + p2.nivelVida);
			if(p1.nivelVida <= 0 || p2.nivelVida <0) {
				if(p1.nivelVida > p2.nivelVida) {
					System.out.println("Ganó " + p1.nombre);
				}else if(p1.nivelVida < p2.nivelVida) {
					System.out.println("Ganó " + p2.nombre);
				}else {
					System.out.println("Un empate, ambos están agotados");
				}
				
				break;
			}
			if(turno == 1) {
				System.out.println("Ataca " + p1.nombre);
				if(p2.esquivar()) {
					System.out.println(p2.nombre + " esquivó el ataque");

				}else {
					p2.nivelVida = p2.nivelVida - p1.atacar();
					System.out.println(p2.nombre + " recibió el ataque");
				}
				turno = 2;
			}else {
				System.out.println("Ataca " + p2.nombre);
				if(p1.esquivar()) {
					System.out.println(p1.nombre + " esquivó el ataque");

				}else {
					p1.nivelVida = p1.nivelVida - p2.atacar();
					System.out.println(p1.nombre + " recibió el ataque");
				}
				turno = 1;
			}
			Thread.sleep(1000);
		}
	}
	
}
