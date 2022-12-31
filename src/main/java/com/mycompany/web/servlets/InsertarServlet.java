package com.mycompany.web.servlets;

import com.mycompany.web.models.Lector;

import java.io.IOException;

import com.mycompany.web.models.AccionesLector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevolector")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a, n, c;

        a = req.getParameter("apellido");

        n = req.getParameter("nombre");

        c = req.getParameter("contacto");

        Lector nuevolector = new Lector();

        nuevolector.setNombre(n);
        nuevolector.setApellido(a);
        nuevolector.setContacto(c);

        int estado = AccionesLector.registrarlector(nuevolector);

        if (estado == 1) {
            resp.sendRedirect("exito.jsp");
            System.out.println("todo ok");
        } else {
            System.out.println("Error");
            resp.sendRedirect("error.jsp");
        }

    }
}
