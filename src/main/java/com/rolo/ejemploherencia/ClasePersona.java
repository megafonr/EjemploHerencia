/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.ejemploherencia;

/**
 *
 * @author Rolo  ---  Clase Padre  ----
 */
public class ClasePersona {
    private int DNI;
    private int edad;
    private String Nombre, Apellido;
    private char Sexo;

//Constructor 
    public ClasePersona(int DNI, int edad, String Nombre, String Apellido, char Sexo) {
        this.DNI = DNI;
        this.edad = edad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
    }
//fin
//   Getters y setters ... 

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String esmayordeedad(int edad){
      String resultado;  
      
      if (edad >18 ){
        System.out.println(" Es mayor de edad: " + edad );
        resultado = "SI";
      }
      else {
        System.out.println(" Es menor de edad: " + edad );
        resultado = "NO";
      }
      return resultado ;
    }
}
