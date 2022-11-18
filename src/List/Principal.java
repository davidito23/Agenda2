package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int compromisoPago = 100000, diasMora = 0;
        double saldoDeuda = 0, incrementoMora = 0, deudaTotal = 0;

        Scanner scnr = new Scanner(System.in);

        ArrayList<Agenda> lista = new ArrayList<Agenda>();
        Agenda agenda = new Agenda();

        System.out.println("Ingrese nombre");
        agenda.setNombre(scnr.nextLine());

        System.out.println("Ingrese direccion");
        agenda.setDireccion(scnr.nextLine());

        System.out.println("Ingrese pago");
        agenda.setPago(scnr.nextDouble());

        System.out.println("Ingrese dias en mora");
        agenda.setDiasMora(scnr.nextInt());

        lista.add(agenda);

        saldoDeuda = agenda.getPago() - compromisoPago;
        if (agenda.getPago() >= compromisoPago) {
            System.out.println("No tiene saldo pendiente");
        } else {
            System.out.println("tiene un saldo pendiente de: $ " + saldoDeuda);

        }
        
        if(diasMora <= 6){    
            incrementoMora = saldoDeuda * 0.05;
        }else{
            System.out.println("Error dias mora no permitido");
        }
        deudaTotal = saldoDeuda + incrementoMora;
            System.out.println("La deuda tiene un incremento de " + incrementoMora + "La deuda total es de " + deudaTotal );
        
        
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i) + " ");
        }

    }
}
