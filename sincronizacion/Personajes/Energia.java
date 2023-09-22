package Personajes;

public class Energia {

    int unidadesDeVida;

    public Energia() {
        unidadesDeVida = 10;
    }

    public synchronized void dañar() {
        if (unidadesDeVida>4) {
            unidadesDeVida -= 3;
        }else{
            System.out.println("La energia es menor a 3");
        }
    }

    public synchronized void revitalizar() {
        unidadesDeVida += 3;
        System.out.println("Revitalizado");
    }

    public int getEnergia() {
        return unidadesDeVida;
    }
}
