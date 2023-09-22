//EJERCICIO 2 - TRABAJO PRACTICO 1
public class MiEjecucion extends Thread {
    public void run (){
        ir();
    }
    public void ir(){
        hacerMas();
    }
    private void hacerMas(){
        System.out.println("En la pila");
    }
}

class TesteoHilos{
    public static void main(String [] args){
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        System.out.println("En el main");
    }
}
