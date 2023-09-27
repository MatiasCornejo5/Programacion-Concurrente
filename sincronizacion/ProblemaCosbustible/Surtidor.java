package ProblemaCosbustible;

public class Surtidor {

    double capacidadMaxima;
    boolean dispSurtidor;

    public Surtidor() {
        capacidadMaxima = 1000;
        dispSurtidor = true;
    }

    public synchronized boolean cargarCombustible(String patente, double ltsActuales, double topeTanque) {
        // Por defecto este metodo llenara el tanque del auto o vehiculo
        boolean puedeCargar = false;
        if (capacidadMaxima > 0 && dispSurtidor) {
            puedeCargar = true;
            capacidadMaxima -= (topeTanque - ltsActuales);
            System.out.println(patente + ":_____Cargando combustible____");
            dispSurtidor = false;
        }
        return puedeCargar;
    }

    public synchronized void finalizarCarga(String patente) {
        System.out.println(patente + "_____Tanque lleno!!");
        dispSurtidor = true;
        System.out.println("ESTADO DEL SURTIDO: " + capacidadMaxima +" lts");
    }
}
