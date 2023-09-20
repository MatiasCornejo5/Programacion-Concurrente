package Personajes;

public class Personaje {
    private int vida;

	public Personaje() {
		this.vida = 20;
	}

	public synchronized int getVida() {
		return vida;
	}

	public synchronized void modificarVida(int puntos) {
		this.vida = vida + puntos;
		System.out.println("La vida es de " + vida);
	}

}
