package controller;

import jakarta.*;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;

import java.io.IOException;
import java.util.List;

@WebServlet("/libri")
public class LibreriaMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Libreria libreria;

	public LibreriaMVC() {
		super();
		this.libreria = new Libreria();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//	
//				libreria.addLibro(new Libro("io robot", 10, 100, 1));
//				libreria.addLibro(new Libro("tu robot", 11, 100, 2));
//				libreria.addLibro(new Libro("lui robot", 12, 100, 3));
//				libreria.addLibro(new Libro("noi robot", 15, 100, 4));
//				
		if (request.getParameter("id") != null) {

			int id = Integer.parseInt(request.getParameter("id"));
			Libro l = this.libreria.getLibroById(id);

			response.getWriter().append(l.toString());
		} else {
			List<Libro> libri = libreria.getLibri();
			
			request.setAttribute("ElencoLibri", libri);		
			
			// response.sendRedirect("lista.jsp"); //redirect semplice
			
			request.getRequestDispatcher("lista.jsp").forward(request, response);
			
			//response.getWriter().append("Elenco libri: ").append(libri.toString());
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("titolo") != null) {

			String titolo = request.getParameter("titolo");
			int prezzo = Integer.parseInt(request.getParameter("prezzo"));
			int pagine = Integer.parseInt(request.getParameter("pagine"));
			int editore = Integer.parseInt(request.getParameter("editore"));

			Libro l = new Libro(titolo, prezzo, pagine, editore);
			libreria.addLibro(l);

		}

		doGet(request, response);
	}

}
