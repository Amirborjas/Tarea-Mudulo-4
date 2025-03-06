/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author amire
 */
import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados { 
    
    private List<Empleado> empleados;

  
    public GestorEmpleados() {
        this.empleados = new ArrayList<>();
    }


    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }


    public void mostrarDetallesEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Detalles de los empleados:");
            for (Empleado empleado : empleados) {
                empleado.imprimirInformacion();
                System.out.println("--------------------");
            }
        }
    }
}