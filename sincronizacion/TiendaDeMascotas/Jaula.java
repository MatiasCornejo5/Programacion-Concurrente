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

    public synchronized void dejarHamaca(String nombre) {
        System.out.println(nombre + " dejo de usar la hamaca.");
        this.dispHamaca = true;
    }
}

class TiendaDeMascotas {
    public static void main(String[] args) {
        /*
         * En una tienda de mascotas están teniendo problemas para tener a todos sus
         * hámster felices.
         * Los hámster comparten una jaula en la que hay un plato con comida, una rueda
         * para hacer
         * ejercicio, y una hamaca en la que pueden descansar. Todos los hamsters
         * quieren comer del
         * plato, correr en la rueda y luego descansar en la hamaca.Pero se encuentran
         * con el inconveniente de que solo 1 de ellos puede comer del plato, solo uno
         * puede correr en la
         * rueda y solo 1 puede descansar en la hamaca.
         * a) Implemente un programa para simular la situación planteada, en donde todos
         * los
         * hámster puedan realizar todas las actividades.
         * b) Nota: considere que todas las actividades consumen cierto tiempo, por lo
         * que para
         * la simulación se sugiere asignar ese tiempo con “sleep()"
         */

        Jaula jaula = new Jaula();
        Hamster hamster1 = new Hamster("Hamster 1", jaula);
        Hamster hamster2 = new Hamster("Hamster 2", jaula);
        Hamster hamster3 = new Hamster("Hamster 3", jaula);

        hamster1.start();
        hamster2.start();
        hamster3.start();

    }
}