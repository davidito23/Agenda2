package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int compromisoPago = 100000;
        double saldoDeuda, incrementoMora = 0, deudaTotal = 0;

        Scanner scnr = new Scanner(System.in);

        ArrayList<Agenda> lista = new ArrayList<>();
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
            System.exit(0);
        } else {
            System.out.println("tiene un saldo pendiente de: $ " + saldoDeuda);
            
        }
        
        if(agenda.getDiasMora() >= 1 && agenda.getDiasMora() <= 5){    
            incrementoMora = saldoDeuda * 0.05;
            
        }else if(agenda.getDiasMora() >=6 && agenda.getDiasMora() <=20){
            incrementoMora = saldoDeuda * 0.010;
        }else if(agenda.getDiasMora() >=21 && agenda.getDiasMora() <=50){
            incrementoMora = saldoDeuda * 0.20;
        }else if(agenda.getDiasMora() >=51 && agenda.getDiasMora() <=100){
            incrementoMora = saldoDeuda * 0.32;
        }
            deudaTotal = saldoDeuda + incrementoMora;
            System.out.println("La deuda tiene un incremento de " + incrementoMora + "La deuda total es de " + deudaTotal );
        
        
        for (int i = 0; i < lista.size(); i++) {

            System.out.print(lista.get(i) + " ");
        }

    }
}
