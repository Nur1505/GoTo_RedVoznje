package com.nura.servleti;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.PogodnaVremena;
import BO.Provjera;
import DAO.GoToDAOImplementation;
import DTO.Autobus;





/**
 * Servlet implementation class GotoServlet
 */
@WebServlet("/GotoServlet")
public class GotoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String brojTr = request.getParameter("brTrenutne");
		 String brojOdr = request.getParameter("brOdredista");
		 
		 Provjera provjera = new Provjera();
		 
		 int brojTrenutne = provjera.vracaBrojOdStringa(brojTr);
		 int brojOdredista=provjera.vracaBrojOdStringa(brojOdr);
		 
		 GoToDAOImplementation dao = new  GoToDAOImplementation();
		 ArrayList<Autobus>autobusi = new  ArrayList<Autobus>();
		 try {
			 
			autobusi= dao.vracaSatniceAutobusaVeceOdTrenutnogVremena(brojTrenutne);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 PogodnaVremena pogodnaVremena = new  PogodnaVremena();
		 
		 String ispis= pogodnaVremena.ispisPogodnihAutobusaIVremna(autobusi);
		 request.setAttribute("autobusi", ispis);
		 ServletContext context = getServletContext();
         RequestDispatcher dispatcher = context.getRequestDispatcher("/tabele.jsp");
         dispatcher.forward(request, response);
	}

}
