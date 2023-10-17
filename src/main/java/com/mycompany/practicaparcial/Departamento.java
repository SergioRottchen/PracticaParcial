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
public class Departamento implements Comparable<Departamento> {
   private String nombre;
   private List<Localidad> localidades;
   
   public Departamento(String nombre){
       this.nombre = nombre;
       this.localidades = new ArrayList<Localidad>();
   }

    public String getNombre() {
        return nombre;
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    @Override
    public int compareTo(Departamento otroDepartamento) {
        // Comparar los departamentos por sus nombres
        return this.nombre.compareTo(otroDepartamento.getNombre());
    }
    //En este ejemplo, estamos comparando dos departamentos basados en sus nombres utilizando el método compareTo. La implementación del método devuelve un valor negativo si this debería ir antes que otroDepartamento, un valor positivo si this debería ir después de otroDepartamento, y cero si son iguales.
   
}
