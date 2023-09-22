package Personajes;

public class CriaturaOscura extends Thread {
    Energia energia;
    String nombre;

    public CriaturaOscura(Energia energia, String unNombre) {
        this.energia = energia;
        this.nombre = unNombre;
    }

    public void run() {
        while (true) {
            energia.dañar();
            System.out.println("Unidades de energia luego del ataque: " + energia.getEnergia());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
