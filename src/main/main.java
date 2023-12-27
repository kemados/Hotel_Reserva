/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.alojamientos;
import Entidades.habitaciones;
import Entidades.personas;
import Entidades.reservas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emanuel
 */

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        List<habitaciones> habitaciones = new ArrayList<>();
        List<reservas> reservas = new ArrayList<>();
        List<alojamientos> alojamientos = new ArrayList<>();

        // Inicializa las habitaciones
        for (int i = 1; i <= 10; i++) {
            habitaciones.add(new habitaciones(i));
        }

        int reservaId = 1;
        boolean running = true;
        
        while (running) {
            System.out.println("Menú:");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Ver Reservas");
            System.out.println("3. Realizar Alojamiento");
            System.out.println("4. Ver Alojamientos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    // Realiza la reserva
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese su edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese su DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese su país: ");
                    String pais = scanner.nextLine();
                    personas persona = new personas(nombre, edad, dni, pais);
                    
                    System.out.println("Habitaciones disponibles:");
                    for (habitaciones habitacion : habitaciones) {
                        System.out.println(habitacion);
                    }
                    
                    System.out.print("Ingrese el número de habitacion: ");
                    int numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();
                    habitaciones habitacionSeleccionada = habitaciones.get(numeroHabitacion - 1);
                    
                    System.out.print("Ingrese la cantidad de personas: ");
                    int cantidadPersonas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese las fechas (separadas por comas: Dia, Mes, Año): ");
                    String fechas = scanner.nextLine();
                    
                    reservas reserva = new reservas(reservaId, numeroHabitacion, cantidadPersonas, fechas);
                    reservas.add(reserva);
                    habitacionSeleccionada.ocuparHabitacion(fechas);
                    reservaId++;
                    break;
                
                case 2:
                    // Muestra las reservas
                    for (reservas r : reservas) {
                        System.out.println(r);
                    }
                    break;
                
                case 3:
                    // Realiza el alojamiento
                    System.out.println("Reservas disponibles para alojamiento:");
                    for (reservas r : reservas) {
                        System.out.println(r);
                    }
                    
                    System.out.print("Ingrese el ID de reserva para el alojamiento: ");
                    int idReserva = scanner.nextInt();
                    
                    boolean reservaEncontrada = false;
                    for (reservas r : reservas) {
                        if (r.getId() == idReserva) {
                            alojamientos.add(new alojamientos(idReserva));
                            reservas.remove(r);
                            reservaEncontrada = true;
                            break;
                        }
                    }
                    
                    if (reservaEncontrada) {
                        System.out.println("Alojamiento realizado con exito.");
                    } else {
                        System.out.println("ID de reserva no encontrado.");
                    }
                    break;
                
                case 4:
                    // Muestra el alojamiento
                    for (alojamientos a : alojamientos) {
                        System.out.println(a);
                    }
                    break;
                
                case 5:
                    running = false;
                    break;
                
                default:
                    System.out.println("Opcion invalida. Elija una opcion valida del menu.");
            }
        }
        
        System.out.println("Finalizado");
        scanner.close();
    }
}