package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Oggetto;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import database.Oggetti;

/**
 * Servlet implementation class Libri
 */
@WebServlet("/opere")
public class Opere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Opere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("titolo", "Contrabbando libri");
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		Oggetti.init();
		List<Oggetto> oggetti = Oggetti.deposito
				.stream()
				.filter(o -> o.getTipo().equalsIgnoreCase("opera"))
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
