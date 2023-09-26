package TiendaDeMascotas;

public class Hamster extends Thread {

    private String nombre;
    private Jaula jaula;
    private boolean comio, durmio, jugo;

    public Hamster(String unNombre, Jaula jaula) {
        this.nombre = unNombre;
        this.jaula = jaula;
        this.comio = false;
        this.durmio = false;
        this.jugo = false;
    }

    public void run() {

        while (!this.comio || !this.jugo || !this.durmio) {
            // Intenta comer
            if (!this.comio && jaula.usarPlato(nombre)) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                jaula.dejarPlato(this.nombre);
                this.comio = true;
            }
            if (!this.jugo && jaula.usarRueda(this.nombre)) {
                try {
                    sleep(1500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                jaula.dejarRueda(this.nombre);
                this.jugo = true;
            }
            if (!this.durmio && jaula.usarHamaca(this.nombre)) {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                jaula.dejarHamaca(this.nombre);
                this.durmio = true;
            }
        }
        System.out.println(this.nombre + " FINALIZO TODAS LAS ACTIVIDADES");
    }

}
