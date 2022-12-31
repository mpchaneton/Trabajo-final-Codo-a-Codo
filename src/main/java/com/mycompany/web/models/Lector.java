package com.mycompany.web.models;

import java.io.Serializable;

public class Lector implements Serializable {

    // la clase lectores va a tener los siguientes atributos
   
    private int Id;
    private String Apellido, Nombre, Contacto;

  
    //definimos los setters y los getters de cada uno

    public int getId() {
        return Id;
    }

    public void setId(int nuevoId) {
        this.Id = nuevoId;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String nuevoApellido) {
        this.Apellido = nuevoApellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.Nombre = nuevoNombre;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String nuevoContacto) {
        this.Contacto = nuevoContacto;
    }
}
