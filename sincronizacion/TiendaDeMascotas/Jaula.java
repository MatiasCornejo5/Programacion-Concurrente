package TiendaDeMascotas;

public class Jaula {
    boolean dispRueda;
    boolean dispPlato;
    boolean dispHamaca;

    public Jaula() {
        dispHamaca = true;
        dispPlato = true;
        dispRueda = true;
    }

    // Plato
    public synchronized boolean usarPlato(String nombre) {
        boolean sePuedeUsar = false;
        if (this.dispPlato) {
            this.dispPlato = false;
            System.out.println(nombre + " esta comiendo.");
            sePuedeUsar = true;
        }

        return sePuedeUsar;
    }

    public synchronized void dejarPlato(String nombre) {
        System.out.println(nombre + " dejo de comer.");
        this.dispPlato = true;
    }

    public synchronized boolean usarRueda(String nombre) {// Falso semaforo
        boolean sePuedeUsar = false;
        if (this.dispRueda) {
            this.dispRueda = false;
            System.out.println(nombre + " esta usando la rueda.");
            sePuedeUsar = true;
        }

        return sePuedeUsar;
    }

    public synchronized void dejarRueda(String nombre) {
        System.out.println(nombre + " dejo de usar la rueda.");
        this.dispRueda = true;
    }

    public synchronized boolean usarHamaca(String nombre) {
        boolean sePuedeUsar = false;
        if (this.dispHamaca) {
            this.dispHamaca = false;
            System.out.println(nombre + " esta usando la hamaca.");
            sePuedeUsar = true;
        }

        return sePuedeUsar;
    }
    
    public synchronized void dejarHamaca(String nombre){
        System.out.println(nombre + " dejo de usar la hamaca.");
        this.dispHamaca=true;
    }
}

class TiendaDeMascotas {
    public static void main(String[] args) {

        Jaula jaula = new Jaula();
        Hamster hamster1 = new Hamster("Hamster 1", jaula);
        Hamster hamster2 = new Hamster("Hamster 2", jaula);
        Hamster hamster3 = new Hamster("Hamster 3", jaula);

        hamster1.start();
        hamster2.start();
        hamster3.start();

    }
}