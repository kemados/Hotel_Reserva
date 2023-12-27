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
public class habitaciones {
    
    private int numeroHabitaciones;
    private String fechaOcupacion;

    public habitaciones() {
    }
    

    public habitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.fechaOcupacion = "No ocupada";
    }

    public void ocuparHabitacion(String fecha) {
        fechaOcupacion = fecha;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(String fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    public String toString() {
        return "Número de Habitación: " + numeroHabitaciones + ", Fecha de Ocupación: " + fechaOcupacion;
    }
}
