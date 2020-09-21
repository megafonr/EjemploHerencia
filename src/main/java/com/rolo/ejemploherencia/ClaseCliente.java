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
public class ClaseCliente extends ClasePersona {
private String Categoria;
private int Codigo;
private int CantidadCompras;


    public ClaseCliente(String Categoria, int Codigo, int CantidadCompras, int DNI, int edad, String Nombre, String Apellido, char Sexo) {
        super(DNI, edad, Nombre, Apellido, Sexo);
        this.Categoria = Categoria;
        this.Codigo = Codigo;
        this.CantidadCompras = CantidadCompras;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setCantidadCompras(int CantidadCompras) {
        this.CantidadCompras = CantidadCompras;
    }

    public String getCategoria() {
        return Categoria;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getCantidadCompras() {
        return CantidadCompras;
    }

    public int GenerarCodigo() {
    if (this.Codigo >= 0){
        this.Codigo = this.Codigo + 1;
    }
    return this.Codigo;
    }

    public int agregarCompra(int Canti) {
    if (Canti > 0){
        this.CantidadCompras = this.CantidadCompras + Canti;
    }
    return this.CantidadCompras;
    }

}
