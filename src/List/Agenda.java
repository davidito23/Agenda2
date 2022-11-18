
package List;


public class Agenda {
    private long telefono;
    private String nombre;
    private String direccion;
    private double pago;
    private int diasMora;

    public int getDiasMora() {
        return diasMora;
    }

    public void setDiasMora(int diasMora) {
        this.diasMora = diasMora;
    }
    
    
    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    @Override
    public String toString() {
        return "Agenda [Telefono =" + telefono + ", Nombre =" + nombre + ", Direccion =" 
                + direccion + ", Pago=" + pago + ", Dias en mora=" + diasMora ;
    }
    
}
