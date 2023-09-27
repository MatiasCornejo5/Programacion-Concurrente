package ProblemaCosbustible;

public class Auto extends Vehiculo {

    private Surtidor surtidor; 

    public Auto(String modelo, String marca, String patente, double km, double litros, Surtidor surtidor) {
        super(modelo, marca, patente, km, litros);
        this.surtidor = surtidor;
    }

    public void run (){
        super.run();
        if (tanque<reserva && surtidor.cargarCombustible(patente,tanque,tanqueLleno)) {     
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            surtidor.finalizarCarga(patente);
        }
    }
}
