//MAIN PARA TESTEAR TP 1
public class testeoRecurso {
    //PUNTO 1 - TRABAJO PRACTICO 1
    public static void main(String[] args) {
        Cliente_hilo juan = new Cliente_hilo();
        juan.setName("Juan Lopez");
        Cliente_hilo ines = new Cliente_hilo();
        ines.setName("Ines Garcia");
        juan.start();
        ines.start();
        Recurso.uso();
    }
}