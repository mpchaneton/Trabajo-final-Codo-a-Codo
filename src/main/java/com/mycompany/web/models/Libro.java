package com.mycompany.web.models;

import java.io.Serializable;

public class Libro implements Serializable {
        private int Id;

        private String Nombre_Libro, Autor, Ubicacion;

      
    
        public int getId(){
            return Id;
        }
    
        public void setId(int nuevoId){
            this.Id = nuevoId;
        }

       public String getNombre_Libro(){
            return Nombre_Libro;
        }
    
        public void setNombre_Libro(String nuevoNombre_Libro){
            this.Nombre_Libro = nuevoNombre_Libro;
        }

        public String getAutor(){
            return Autor;
        }
    
        public void setAutor(String nuevoAutor){
            this.Autor = nuevoAutor;
        }
    
        
    
        public String getUbicacion(){
            return Ubicacion;
        }
    
        public void setUbicacion(String nuevoUbicacion){
            this.Ubicacion = nuevoUbicacion;
        }
    }

