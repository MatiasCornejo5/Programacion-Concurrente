package ReservasOnline;

public class TestParqueTematico {
    
    public static void main(String[] args) {
        ParqueTematico parque = new ParqueTematico();
        Visitante [] visitantes = new Visitante [20];

        for (int i = 0; i < visitantes.length; i++) {
            visitantes[i] = new Visitante(i+1, parque);
            visitantes[i].start();
        }
    }
}
