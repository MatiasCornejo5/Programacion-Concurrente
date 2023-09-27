package ReservasOnline;

public class TestParqueTematico {
    /*
     * En un sistema de reserva de espacios en un parque temático en línea, los
     * visitantes pueden
     * seleccionar y reservar áreas específicas para actividades y entretenimiento.
     * Cada área tiene
     * un número limitado de espacios disponibles.
     * Desarrolle un programa que permita a los visitantes reservar áreas según la
     * disponibilidad.
     * Cuando un visitante elige una ubicación, el sistema verifica si está libre y,
     * si es así, lo
     * reserva y emite un comprobante. Es esencial evitar reservas duplicadas en la
     * misma área.
     * El sistema debe proporcionar una experiencia fluida para que los visitantes
     * elijan
     * libremente entre las áreas disponibles mientras se asegura que no se realicen
     * reservas
     * dobles
     */
    public static void main(String[] args) {
        ParqueTematico parque = new ParqueTematico();
        Visitante[] visitantes = new Visitante[20];

        for (int i = 0; i < visitantes.length; i++) {
            visitantes[i] = new Visitante(i + 1, parque);
            visitantes[i].start();
        }
    }
}
