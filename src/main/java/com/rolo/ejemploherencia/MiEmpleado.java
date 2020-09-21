/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.ejemploherencia;

/**
 *
 * @author Rolo
 */
public class MiEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClaseEmpleado Emple1, Emple2;
        Emple1 = new ClaseEmpleado("Convenio",75000,35500323,30,"Juan","Perez",'M');
        Emple2 = new ClaseEmpleado("Fuera Convenio",60000,39150222,25,"Marina","Blum",'F');
        
        System.out.println(" Calculo Sueldo Empleado DNI " + Emple1.getDNI() + ": Saldo: " + Emple1.calcularSueldo() );
        System.out.println(" Calculo Sueldo Empleado DNI " + Emple2.getDNI() + ": Saldo: " + Emple2.calcularSueldo() );
        
    }
}
