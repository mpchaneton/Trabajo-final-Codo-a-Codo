package com.mycompany.web.servlets;

import com.mycompany.web.models.Libro;

import java.io.IOException;

import com.mycompany.web.models.AccionesLibro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevolibro")
public class InsertarLibroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n, a, u;

        n = req.getParameter("Nombre_Libro");

        a = req.getParameter("Autor");

        u = req.getParameter("Ubicacion");

        Libro nuevolibro = new Libro();

        nuevolibro.setNombre_Libro(n);
        nuevolibro.setAutor(a);
        nuevolibro.setUbicacion(u);

        int estado = AccionesLibro.registrarlibro(nuevolibro);

        if (estado == 1) {
            resp.sendRedirect("exitoRegistrarLibro.jsp");
            System.out.println("todo ok");
        } else {
            System.out.println("Error");
            resp.sendRedirect("errorRegistrarLibro.jsp");
        }

    }
}
