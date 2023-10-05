package ActividadObligatoriaTrenTuristico;

public class TestTrenTuristico {
    public static void main(String[] args) {
        
        TrenTuristico tren = new TrenTuristico();
        ControlTren control = new ControlTren(tren);
        PasajeroTren pasajeros [] = new PasajeroTren [10];
    
        for (int i = 0; i < pasajeros.length; i++) { // cargamos el array
            pasajeros[i] = new PasajeroTren(tren);
        }

        for (int i = 0; i < pasajeros.length; i++) { // lanzamos threads
            pasajeros[i].start();
        }

        control.start();
    }

}
