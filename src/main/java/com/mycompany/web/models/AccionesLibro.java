package com.mycompany.web.models;

import java.sql.*;

public class AccionesLibro {

    // insertar registro

    public static int registrarlibro(Libro d) {
        int estado = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // OJO!!!EN CADA CONECCION DEBEREMOS CARGAR LA CLASE PRIMERO PARA
                                                       // PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

            String query = "INSERT INTO libros (Nombre_Libro, Autor, Ubicacion) VALUES (?,?,?)";

            String Nombre_Libro = d.getNombre_Libro();
            String Autor = d.getAutor();
            String Ubicacion = d.getUbicacion();

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, Nombre_Libro);
            pst.setString(2, Autor);
            pst.setString(3, Ubicacion);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return estado;
    }

    // consultar registro por id

    public static Libro verLibro(String LibroAConsultar) {
        Libro libroADevolver = new Libro();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // OJO!!!EN CADA CONECCION DEBEREMOS CARGAR LA CLASE PRIMERO PARA
                                                       // PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

            String query = "SELECT * FROM libros WHERE Nombre_Libro=?";

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setString(1, LibroAConsultar);

            ResultSet consultaLibro = pst.executeQuery();

            if (consultaLibro.next()) {
                libroADevolver.setId(consultaLibro.getInt(1));
                libroADevolver.setNombre_Libro(consultaLibro.getString(2));
                libroADevolver.setAutor(consultaLibro.getString(3));
                libroADevolver.setUbicacion(consultaLibro.getString(4));
                conexion.close();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return libroADevolver;
    }

}
