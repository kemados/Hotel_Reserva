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
public class alojamientos {

    public alojamientos(int idReserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class Alojamiento {
    private int idReserva;

    public Alojamiento() {
    }
    
    public Alojamiento(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    public String toString() {
        return "ID de Reserva Alojada: " + idReserva;
    }

}
}
    