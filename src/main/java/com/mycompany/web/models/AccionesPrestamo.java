package com.mycompany.web.models;

import java.sql.*;

public class AccionesPrestamo {

    // insertar registro

    public static int registrarPrestamo(Prestamo d) {
        int estado = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // OJO!!!EN CADA CONECCION DEBEREMOS CARGAR LA CLASE PRIMERO PARA
                                                       // PODER IDENTIFICAR AL DRIVER Y CONECTARNOS A LA BBDD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final", "root", "");

            String query = "INSERT INTO prestamos (id_Libro, id_Lector) VALUES (?,?)";

            int id_Libro= d.getid_Libro();
            int id_Lector= d.getid_Lector();
           

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setInt(1, id_Libro);
            pst.setInt(2, id_Lector);
           

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("uppsss algo salio mal");
        }

        return estado;
    }

    
}
