package com.mycompany.web.servlets;

import com.mycompany.web.models.Prestamo;

import java.io.IOException;

import com.mycompany.web.models.AccionesPrestamo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prestarLibro")
public class insertarPrestamoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int a, b, c;

        a = req.getIntHeader("id_Libro");

       b = req.getIntHeader("id_Lector");

       c= req.getIntHeader("fecha");

         Prestamo nuevoPrestamo = new Prestamo();

        nuevoPrestamo.setid_Libro(a);
        nuevoPrestamo.setid_Lector(b);
        nuevoPrestamo.setfecha(c);

        int estado = AccionesPrestamo.registrarPrestamo(nuevoPrestamo);

        if (estado == 1) {
            resp.sendRedirect("exitoRegistrarPrestamo.jsp");
            System.out.println("todo ok");
        } else {
            System.out.println("Error");
            resp.sendRedirect("error.jsp");
        }

    }
}
