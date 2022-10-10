package Personajes;

public class Curandero implements Runnable {
    Personaje herido;

    public Curandero(Personaje pj) {
        this.herido = pj;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Cura al personaje que tiene " + herido.getVida()
                + " puntos de vida");
        herido.modificarVida(3);
        System.out.println("Vida del personaje luego de la curacion de " + Thread.currentThread().getName() + " "
                + herido.getVida());
    }
}
