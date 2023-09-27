package ProblemaCosbustible;

public class TestCombustible {
    /*
     * Implemente una clase Auto, subclase de Vehículo con los atributos
     * representativos de auto
     * (patente, modelo, marca, km, etc). Un auto al recorrer varios kilómetros
     * consume
     * combustible, y cuando llega al nivel de la reserva debe cargar combustible
     * para poder
     * continuar. Considere que se desea simular la siguiente situación: Varios
     * autos recorriendo
     * la ciudad y un surtidor que despacha combustible.
     * . Realice un programa para representar la situación. ¿Cómo representará los
     * autos? ¿y el
     * surtidor? Realice una prueba del programa con 5 autos como mínimo.
     * - Considere que el surtidor tiene capacidad para máximo litros de
     * combustible, que se
     * van gastando a medida que los autos pasan a abastecerse.
     * - Cada vez que se realiza una carga de combustible escriba un mensaje
     * apropiado para
     * informar el estado actual del surtidor
     */
    public static void main(String[] args) {
        Surtidor ypf = new Surtidor();

        Auto auto1 = new Auto("1", "vw", "1234AB", 20000, 30, ypf);
        Auto auto2 = new Auto("2", "toyota", "5678AB", 20000, 30, ypf);
        Auto auto3 = new Auto("3", "audi", "1234AC", 20000, 30, ypf);
        Auto auto4 = new Auto("4", "mercedes", "9101AB", 20000, 30, ypf);
        Auto auto5 = new Auto("5", "ford", "0011AB", 20000, 30, ypf);
        Auto auto6 = new Auto("6", "chevrolet", "1250AE", 20000, 30, ypf);
        Auto auto7 = new Auto("7", "nissan", "2525AC", 20000, 30, ypf);
        Auto auto8 = new Auto("8", "peugueot", "1819AF", 20000, 30, ypf);
        Auto auto9 = new Auto("9", "ford", "2324AA", 20000, 30, ypf);
        Auto auto10 = new Auto("10", "chevrolet", "1212AD", 20000, 30, ypf);

        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();
        auto5.start();
        auto6.start();
        auto7.start();
        auto8.start();
        auto9.start();
        auto10.start();

    }
}
