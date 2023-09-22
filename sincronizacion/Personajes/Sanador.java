package Personajes;

public class Sanador extends Thread {
    Energia energia;
    String nombre;

    public Sanador(Energia energia, String unNombre) {
        this.energia = energia;
        this.nombre = unNombre;
    }

    public void run() {
        while (true) {
            energia.revitalizar();
            System.out.println("Unidades de energia luego de la sanacion: " + energia.getEnergia());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
