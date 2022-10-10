package Personajes;

public class Orco implements Runnable {
    Personaje objetivo;

    public Orco(Personaje pj) {
        this.objetivo = pj;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Hace daño al personaje que tiene " + objetivo.getVida()
                + " puntos de vida");
        objetivo.modificarVida(-3);
        System.out.println("Vida del personaje luego del ataque de " + Thread.currentThread().getName() + " "
                + objetivo.getVida());

    }
}
