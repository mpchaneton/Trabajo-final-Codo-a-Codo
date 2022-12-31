package com.mycompany.web.models;

import java.sql.*;

public class AccionesLector {

    // va a trabajar con instancias de la clase lector x eso hay q importarlo

    // METODO REGISTRAR LECTOR

    // definimos un metodo para registrar a un lector
    // recibe un objeto de tipo lector y lo identificamos como c, que nos va a
    // devolver un valor

    public static int registrarlector(Lector c) {
        int estado = 0;

        // esta variable nos sirve para indicar si logramos registrar un nuevo lector
        // si registra un nuevo lector cambia a 1, si no lo registra queda en 0

        // nos conectamos a la base de datos

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

         // creamos una variable para insertar en lenguaje sql en esa bbdd puntual los valores q necesitamos
         // dejamos los valores sin definir para poder reutlizar el codigo

            String query = "INSERT INTO lectores (Apellido,Nombre,Contacto) VALUES (?,?,?)";

         // En esta variable guardamos lo que nos devuelva el metodo getId del objeto lector q estamos recibiendo
         // Esa clase tiene definido el metodo getid
         // Cuando lo llamamos nos trae una valor que esta guardado en ese atributo

            String nombre = c.getNombre();
            String apellido = c.getApellido();
            String contacto = c.getContacto();

        // De esta manera ya tenemos descomprimidos los datos que que recibimos en forma de objeto
        // los guardamos en una variable

        // Una vez reemplazados los ???? por valores generamos otro objeto pst q permita
        // ejecutar y guardar lo q cambiamos


            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, apellido);
            pst.setString(2, nombre);
            pst.setString(3, contacto);


        // Antes guardaba 0, cuando se ejecute va a guardar un uno 
        
            estado = pst.executeUpdate();

        // cerramos la base de datos, al objeto conexion le pedimos que cierre la bbdd

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return estado;
    }

    // actualizar registro

    public static int actualizarLector(Lector c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

            String query = "UPDATE lectores SET Apellido=?,Nombre=?,Contacto=? WHERE Id=?";

            int Id = c.getId();
            String Apellido = c.getApellido();
            String Nombre = c.getNombre();
            String Contacto = c.getContacto();

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, Apellido);
            pst.setString(2, Nombre);
            pst.setString(3, Contacto);
            pst.setInt(4, Id);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return estado;
    }

    // consultar registro por id

    public static Lector verLector(int idAConsultar) {
        Lector lectorADevolver = new Lector();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

            String query = "SELECT * FROM lectores WHERE Id=?";

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setInt(1, idAConsultar);

            ResultSet consultaLector = pst.executeQuery();

            if (consultaLector.next()) {
                lectorADevolver.setId(consultaLector.getInt(1));
                lectorADevolver.setApellido(consultaLector.getString(2));
                lectorADevolver.setNombre(consultaLector.getString(3));
                lectorADevolver.setContacto(consultaLector.getString(4));
                conexion.close();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return lectorADevolver;
    }

}
