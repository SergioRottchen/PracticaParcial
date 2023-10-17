/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloParcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sirgi
 */
public class Usuario {
 private String nombre;
 private int dni;
 private String nTelefono;
 private List<Libro> listaLibrosPrestados;

    public Usuario(String nombre, int dni, String nTelefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.nTelefono = nTelefono;
        this.listaLibrosPrestados = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getnTelefono() {
        return nTelefono;
    }

    public List<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public void setListaLibrosPrestados(List<Libro> listaLibrosPrestados) {
        this.listaLibrosPrestados = listaLibrosPrestados;
    }
 public void agregarLibroPrestado(Libro libro){
     listaLibrosPrestados.add(libro);
 }
}
