
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        Agenda AG = new Agenda();

        long telefono;
        int compromisoPago = 100000;
        double pago, saldoDeuda;
        String nombre, direccion;
        int opcion;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "AGENDA DE CLIENTES\n\n"
                    + "1. Lista de clientes\n"
                    + "2. Insertar cliente"
                    + "3. Buscar cliente\n"
                    + "4. Modificar datos de cliente\n"
                    + "5. Lista de clientes con deuda\n"
                    + "0. Salir"));

            switch (opcion) {
                case 1:
                    if (AG.AgendaVacia()) {
                        JOptionPane.showMessageDialog(null, "Lista vacía");
                    } else {
                        AG.MostrarAgenda();
                    }
                    break;
                case 2:
                   telefono = Long.parseLong(JOptionPane.showInputDialog(null, "Inserte numero de telefono"));
                   nombre = JOptionPane.showInputDialog(null, "Inserte un nombre");
                   direccion = JOptionPane.showInputDialog(null, "Inserte una direccion");
                   pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Pago realizado "));
                   AG.InsertarCliente(telefono, nombre, direccion, pago);
                   
                   saldoDeuda = pago - compromisoPago;
                   
                   if(pago >= compromisoPago){
                   JOptionPane.showMessageDialog(null, "No tiene saldo pendiente");
                   }else{
                       JOptionPane.showMessageDialog(null, "tiene un saldo pendiente de: $ " + saldoDeuda);
                       
                   }
                   
                   break;

                case 0:
                    System.out.println("\nSuerte agonia");
                    break;

            }

        } while (opcion != 0);
    }

}
