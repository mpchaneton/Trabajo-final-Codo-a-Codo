package com.mycompany.web.models;

import java.io.Serializable;

public class Prestamo implements Serializable {
    private int id_Libro, id_Lector, fecha;

   
    public int getid_Libro() {
        return id_Libro;
    }

    public void setid_Libro(int nuevoid_Libro) {
        this.id_Libro = nuevoid_Libro;
    }

    public int getid_Lector() {
        return id_Lector;
    }

    public void setid_Lector(int nuevoid_Lector) {
        this.id_Lector = nuevoid_Lector;
    }

    public int getfecha() {
        return fecha;
    }

    public void setfecha(int nuevofecha) {
        this.fecha = nuevofecha;
    }

}
