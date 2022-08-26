
public class Persona{

    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected String fecha_Nacimiento;
    protected String sexo;

    public Persona (){ 
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected String getDni() {
        return dni;
    }

    protected void setDni(String dni) {
        this.dni = dni;
    }

    protected String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    protected String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    protected void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    protected String getSexo() {
        return sexo;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre.toString() + " " + apellido.toString() + " " + dni.toString();
    }

}