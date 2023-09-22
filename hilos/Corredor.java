//EJERCICIO 6 - TRABAJO PRACTICO 1

/* Imagina que estás organizando una carrera de atletismo con varios corredores.
Quieres simular esta carrera utilizando múltiples hilos en Java. Cada corredor será
representado por un hilo independiente que avanzará en la pista de carreras.
Crea una clase llamada Corredor que serán los hilos. Dentro de esta clase, define
los atributos necesarios como el nombre del corredor y la distancia recorrida. Cada
corredor sabe la distancia que recorrió, por lo que deberá imprimir su nombre y el
avance (aleatorio entre 1 y 10), por cada paso que realiza. Entre cada paso
realizado descansa. Una vez que haga 100 pasos, el corredor habrá terminado.
En la clase principal, crea un arreglo de objetos Corredor (instancias de la clase
Corredor) y para cada corredor en el arreglo, crea un objeto Thread y pasar la
instancia del corredor como argumento al constructor del Thread.
Inicia todos los hilos creados usando el método start(). Utiliza Thread.sleep() dentro
del método run() de cada corredor para simular el tiempo entre pasos.
Al finalizar la carrera se desea saber qué corredor hizo la mayor distancia y cual fue.
*/

public class Corredor extends Thread {
    String nombre;
    int distanciaRecorrida;

    public Corredor(String nuevoNombre) {
        nombre = nuevoNombre;
        distanciaRecorrida = 0;
    }

    public void run() {
        int pasos;
        for (int i = 0; i < 100; i++) {
            pasos = (int) (Math.random() * 10 + 1);
            distanciaRecorrida += pasos;
            System.out.println("Nombre: " + this.nombre + " Avanzo: " + pasos);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Nombre: " + this.nombre + " ha finalizado, distancia recorrida: " + distanciaRecorrida);
    }

}

class testCarrera {

    public static void main(String[] args) {

        Corredor[] corredores = new Corredor[5];

        for (int i = 0; i < corredores.length; i++) {
            corredores[i] = new Corredor("Corredor " + (i + 1));
            corredores[i].start();
        }

        for (int i = 0; i < corredores.length; i++) {
            try {
                corredores[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        Corredor ganador = corredores[0];
        for (int i = 1; i < corredores.length; i++) {
            if (corredores[i].distanciaRecorrida > ganador.distanciaRecorrida) {
                ganador = corredores[i];
            }
        }
        System.out.println(
                "El ganador es: " + ganador.nombre + " con una distancia recorrida de: " + ganador.distanciaRecorrida);
    }
}