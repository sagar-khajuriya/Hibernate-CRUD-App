package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.service.IPersonService;
import in.ineuron.servicefactory.PersonServiceFactory;

@WebServlet("/delete")
public class PersonDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IPersonService personService = PersonServiceFactory.getPersonService();
		// delete
		Integer id = Integer.parseInt(request.getParameter("id"));
		String delete = personService.delete(id);

		request.setAttribute("delete", delete);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./delete.jsp");
		requestDispatcher.forward(request, response);
	}
}
