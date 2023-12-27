/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Emanuel
 */
public class reservas {
    
    private int id;
    private int numeroHabitaciones;
    private int cantidadPersonas;
    private String fechas;

    public reservas() {
    }

    public reservas(int id, int numeroHabitaciones, int cantidadPersonas, String fechas) {
        this.id = id;
        this.numeroHabitaciones = numeroHabitaciones;
        this.cantidadPersonas = cantidadPersonas;
        this.fechas = fechas;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public String toString() {
        return "ID de Reserva: " + id + ", Número de Habitación: " + numeroHabitaciones + ", Cantidad de Personas: " + cantidadPersonas + ", Fechas: " + fechas;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

