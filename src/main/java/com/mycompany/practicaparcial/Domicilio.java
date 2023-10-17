/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaparcial;

/**
 *
 * @author sirgi
 */
public class Domicilio {
    private String calle;
    private int nroCalle;
    private int piso;
    private int depto;
    private Provincia provincia;
    private Localidad localidad;
    private Departamento departamento;
    
    public Domicilio(String calle, int nroCalle,int piso, int depto, Provincia provincia,Localidad localidad,Departamento departamento ){
        this.calle=calle;
        this.nroCalle = nroCalle;
        this.piso = piso;
        this.depto =depto;
        this.provincia=provincia;
        this.localidad=localidad;
        this.departamento=departamento;
    }
}
