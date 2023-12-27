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
public class personas {
  
    private String nombre;
    private int edad;
    private String dni;
    private String pais;

    public personas() {
    }

    public personas(String nombre, int edad, String dni, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", País: " + pais;
    }
}
