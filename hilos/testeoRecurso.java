public class testeoRecurso {
    public static void main(String[] args) {
        Cliente_hilo juan = new Cliente_hilo();
        juan.setName("Juan Lopez");
        Cliente_hilo ines = new Cliente_hilo();
        ines.setName("Ines Garcia");
        ines.start();
        juan.start();
        
        /*Recurso.uso();*/
    }
}