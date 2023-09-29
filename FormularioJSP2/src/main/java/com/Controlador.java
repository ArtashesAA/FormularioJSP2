package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controlador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");
	    String apellidos = request.getParameter("apellidos");
	    String mail = request.getParameter("mail");
	    String genero = request.getParameter("genero");
	    String[] lenguaje = request.getParameterValues("lenguaje");
	    String[] idioma = request.getParameterValues("idioma"); 
	    String comentario = request.getParameter("comentario");
		
	    request.setAttribute("nombre", nombre);
	    request.setAttribute("apellidos", apellidos);
	    request.setAttribute("mail", mail);
	    request.setAttribute("genero", genero);
	    request.setAttribute("lenguaje", lenguaje);
	    request.setAttribute("idioma", idioma);
	    request.setAttribute("comentario", comentario);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/Formulario.jsp");

	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
