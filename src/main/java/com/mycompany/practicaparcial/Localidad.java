/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaparcial;

/**
 *
 * @author sirgi
 */
public class Localidad {
    private String nombre;
    private int codigoPostal;

    public String getNombre() {
        return nombre;
    }

    public long getCodigoPostal() {
        return codigoPostal;
    }

    public Localidad(String nombre, int codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }
    
}
