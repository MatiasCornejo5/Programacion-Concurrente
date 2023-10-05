package ActividadObligatoriaTrenTuristico;

public class TestTrenTuristico {
    public static void main(String[] args) {
        
        TrenTuristico tren = new TrenTuristico();
        ControlTren control = new ControlTren(tren);
        Ticketera ticketera = new Ticketera();
        PasajeroTren pasajeros [] = new PasajeroTren [10];
    
        for (int i = 0; i < pasajeros.length; i++) { // cargamos el array
            pasajeros[i] = new PasajeroTren(tren, ticketera);
        }

        for (int i = 0; i < pasajeros.length; i++) { // lanzamos threads
            pasajeros[i].start();
        }

        control.start();
        

    }

}
