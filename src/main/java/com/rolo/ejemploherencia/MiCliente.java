/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.ejemploherencia;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rolo
 */
public class MiCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClaseCliente Clie1, Clie2;
        Clie1 = new ClaseCliente("Empleado",0,10,35500323,30,"Juan","Perez",'M');
        Clie2 = new ClaseCliente("Gerarquico",0,50,39150222,25,"Marina","Blum",'F');
        
        Clie1.setCodigo(0);
        Clie1.setCategoria("Empleado");
        Clie1.setCantidadCompras(30);
        Clie1.setApellido("Perez");
        Clie1.setDNI(35353535);
        Clie1.setNombre("Pedrito");
        Clie1.setSexo('X');
        Clie1.setEdad(35);
        
        Clie2.setCategoria("Directivo");
        Clie2.setCantidadCompras(8);
        System.out.println(" Nuevo Empleado Codigo: " + Clie1.GenerarCodigo() );
        System.out.println(" Cantidad Compra actual: " + Clie1.getCantidadCompras() );
        System.out.println(" Agregar Compra , Cantidad: " + Clie1.agregarCompra(25) );
        System.out.println(" Nueva Cantidad Compra actual: " + Clie1.getCantidadCompras() );
        System.out.println(" Nombre y Apellido: " + Clie1.getNombre() + " - " + Clie1.getApellido() );
        System.out.println(" DNI  Sexo : " + Clie1.getDNI() + " - " +Clie1.getSexo() );
        System.out.println(" Edad: " + Clie1.getEdad() + "  --- Es Mayor?: " + Clie1.esmayordeedad(Clie1.getEdad()) );
        
            }
}
