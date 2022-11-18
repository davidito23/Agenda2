
public class Agenda {

    private Nodo inicio, fin;

    public Agenda() {
        inicio = fin = null;
    }

    public boolean AgendaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarCliente(long telefono, String nombre, String direccion, double pago) {
        inicio = new Nodo(telefono, nombre, direccion, pago);
    }

    public void MostrarAgenda() {

        if (!AgendaVacia()) {

            Nodo Auxiliar = inicio;

            while (Auxiliar != null) {

                System.out.print("Telefono: " + Auxiliar.telefono + "\n");
                System.out.print("Nombre: " + Auxiliar.nombre + "\n");
                System.out.print("Direccion :" + Auxiliar.direccion + "\n");
                System.out.print("Pago:" + Auxiliar.pago + "\n");
                Auxiliar = Auxiliar.siguiente;
                
                
                
                
            }
        }

    }
    
}
