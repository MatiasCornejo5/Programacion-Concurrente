package Personajes;

public class Main {

	public static void main(String[] args) {
		/*
		 * Personaje pj = new Personaje();
		 * Orco orco = new Orco(pj);
		 * Curandero curandero = new Curandero(pj);
		 * 
		 * Thread orcoThread = new Thread(orco, "Orco");
		 * Thread curanderoThread = new Thread(curandero, "Curandero");
		 * 
		 * orcoThread.start();
		 * curanderoThread.start();
		 * 
		 * try {
		 * orcoThread.join();
		 * curanderoThread.join();
		 * } catch (InterruptedException e) {
		 * e.printStackTrace();
		 * }
		 * 
		 * System.out.println("La vida final es de " + pj.getVida());
		 */

		Energia energia = new Energia();
		Sanador pjSanador = new Sanador(energia, "Sanador");
		CriaturaOscura pjOscuro = new CriaturaOscura(energia, "Demonio");

		pjOscuro.start();
		pjSanador.start();

	}
}
