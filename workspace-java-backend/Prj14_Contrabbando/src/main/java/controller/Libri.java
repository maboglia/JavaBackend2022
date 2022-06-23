package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import model.Oggetto;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import database.Oggetti;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/libri")
public class Libri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Libri() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		response.getWriter().append("<h1>Libri</h1>");
	
		//response.sendRedirect("tabella.jsp");//redirect
	
		//request dispatcher
//		request.getRequestDispatcher("tabella.jsp").forward(request, response);
		
		request.setAttribute("titolo", "Contrabbando libri");
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		Oggetti.init();
		List<Oggetto> oggetti = Oggetti.deposito
				.stream()
				.filter(o -> o.getTipo().equalsIgnoreCase("libro"))
				.collect(Collectors.toList());
		request.setAttribute("oggettiContrabbando", oggetti);
		request.getRequestDispatcher("tabella.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
