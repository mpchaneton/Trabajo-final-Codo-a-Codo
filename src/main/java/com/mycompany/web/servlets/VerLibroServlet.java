package com.mycompany.web.servlets;

import java.io.IOException;

import com.mycompany.web.models.AccionesLibro;
import com.mycompany.web.models.Libro;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verLibro")
public class VerLibroServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String i = (req.getParameter("Nombre_Libro"));

        Libro registro = AccionesLibro.verLibro(i);

        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("/infoLibro.jsp");
        respuesta.forward(req,resp);
    }
    
}

