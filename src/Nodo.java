/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Esteban Padilla
 */
public class Nodo {
    
    public Nodo siguiente, anterior;
    public long telefono;
    public String nombre;
    public String direccion;
    public double pago;
    
    
    public Nodo(long telefono, String nombre, String direccion, double pago){
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pago = pago;
        this.siguiente = null;
        this.anterior = null;
    } 
    
    public Nodo(long telefono, String nombre, String direccion, double pago, Nodo siguiente, Nodo anterior){
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pago = pago;
        this.siguiente = siguiente;
        this.anterior = anterior;
    } 
          
}
