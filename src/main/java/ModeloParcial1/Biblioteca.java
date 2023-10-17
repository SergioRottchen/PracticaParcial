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
public class Biblioteca {
private List<Libro> libros;
private List <Usuario> usuarios;

public Biblioteca(){
    this.libros = new ArrayList();
    this.usuarios = new ArrayList();
}
public void prestarLibro(Usuario usuario,Libro libroaPrestar){
  for(Libro libro: libros ){
      if(libro.getTitulo().equals(libroaPrestar.getTitulo())){
          if(libro.isPrestado()==false){
              libro.setPrestado(true);
              usuario.agregarLibroPrestado(libro);
              
          }else{
              System.out.println("Todas las copias del libro solicitado fueron prestadas");
          }
      }
  }  
}
}
