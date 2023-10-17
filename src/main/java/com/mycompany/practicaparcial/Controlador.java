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
public class Controlador {

    private List<Departamento> departamentos;
    private List<Domicilio> domicilios;

    public Controlador() {
        this.departamentos = new ArrayList<Departamento>();
        this.domicilios = new ArrayList<Domicilio>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void agregarDomicilio(Domicilio domicilio) {
        domicilios.add(domicilio);
    }

    public Localidad crearLocalidad(String nombre, int codigoPostal) {
        for (Departamento departamento : departamentos) {
            for (Localidad localidad : departamento.getLocalidades()) {
                if (localidad.getNombre().equals(nombre) || localidad.getCodigoPostal()==codigoPostal) {
                    throw new IllegalArgumentException("Ya existe una localidad con el mismo nombre o código postal.");
                }
            }
        }

        Localidad nuevaLocalidad = new Localidad(nombre, codigoPostal);
        // Agregar la nueva localidad al departamento (asumiendo que ya tienes una referencia al departamento)
        // departamento.agregarLocalidad(nuevaLocalidad);

        return nuevaLocalidad;
    }
}
