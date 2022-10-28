package com.bank.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.entidades.Customer;
import com.bank.servicios.BanckService;

/**
 * Servlet implementation class ListaClientesServlet
 */

public class ListaClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//ATRIBUTOS
    BanckService listaService = new BanckService();
	
    //CONSTRUCTORES
    public ListaClientesServlet() {
        super();
        System.out.println(".... instanciando Lista cliente Servlet");
    }
    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("estoy en el do post");
		List<Customer> listaclientes = listaService.dameTodosLosClientes();
		request.setAttribute("lista", listaclientes);
		RequestDispatcher rd = request.getRequestDispatcher("listaClientes.jsp");
		rd.forward(request, response);
	}

}
