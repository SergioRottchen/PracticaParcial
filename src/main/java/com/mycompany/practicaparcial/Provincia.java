/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaparcial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sirgi
 */
public class Provincia {
 private String nombre;
 private List<Departamento> departamentos;
 
 
 public Provincia(String nombre){
     this.nombre = nombre;
     this.departamentos= new ArrayList<Departamento>();
 }
}
