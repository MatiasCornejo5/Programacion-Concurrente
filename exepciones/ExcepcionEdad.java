import java.lang.reflect.Executable;

public class ExcepcionEdad extends Exception{ 
    public ExcepcionEdad() {        
    }

    @Override
    public String toString() {
        return "ExcepcionEdad: Es menor de edad";
    }
}