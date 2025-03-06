/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author amire
 */
public class Main { // public class Main: Define la clase Main

    public static void main(String[] args) { // public static void main: Punto de entrada del programa
        // Crear una instancia de GestorEmpleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Agregar empleados
        gestor.agregarEmpleado(new Empleado("Amir Borjas", 20, 90000));
        gestor.agregarEmpleado(new Empleado("Maria Garcia", 30, 60000));
        gestor.agregarEmpleado(new Empleado("Elisabet Cubas", 25, 75000));

        // Mostrar detalles de los empleados
        gestor.mostrarDetallesEmpleados();
    }
}