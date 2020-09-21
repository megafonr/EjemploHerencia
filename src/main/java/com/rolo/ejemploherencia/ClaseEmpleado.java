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
public class ClaseEmpleado extends ClasePersona {
private String TipoContrato;
private double Sueldo;

    public ClaseEmpleado(String TipoContrato, double Sueldo, int DNI, int edad, String Nombre, String Apellido, char Sexo) {
        super(DNI, edad, Nombre, Apellido, Sexo);
        this.TipoContrato = TipoContrato;
        this.Sueldo = Sueldo;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public double calcularSueldo() {
        double total;
        
        if (TipoContrato == "Convenio") {
            total = Sueldo * 1.08;
        } else if (TipoContrato == "Fuera Convenio")  {
            total = Sueldo * 1.10;
        } else {
            total = Sueldo * 1.05;
        }
        
      return total;
    }

}