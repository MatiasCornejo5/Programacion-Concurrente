package SemaforosGenericos.ProblmaComedor;

public class TestComedorAnimales {
    public static void main(String[] args) {
        GestionComedor comedor = new GestionComedor(5);
        prenderG(15, comedor);
        prenderP(10, comedor);
    }

    public static void prenderG(int cant, GestionComedor comedor) {
        Gato gatos[] = new Gato[cant];
        for (int i = 0; i < cant; i++) {
            gatos[i] = new Gato(comedor);
            gatos[i].start();
        }
    }

    public static void prenderP(int cant, GestionComedor comedor) {
        Perro perritos[] = new Perro [cant];
        for (int i = 0; i < cant; i++) {
            perritos[i] = new Perro (comedor);
            perritos[i].start();
        }
    }
}
