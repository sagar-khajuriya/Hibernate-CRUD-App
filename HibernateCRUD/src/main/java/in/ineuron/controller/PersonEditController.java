package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.model.Person;
import in.ineuron.service.IPersonService;
import in.ineuron.servicefactory.PersonServiceFactory;

@WebServlet("/edit")
public class PersonEditController extends HttpServlet {
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
		// Edit
		Integer id =Integer.parseInt(request.getParameter("id"));
		Person personById = personService.getPersonById(id);
		if (personById != null) {
			request.setAttribute("personById", personById);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./edit.jsp");
			requestDispatcher.forward(request, response);
		} else {
			String result = "notfound";
			request.setAttribute("result", result);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("./edit.jsp");
			requestDispatcher.forward(request, response);

	}
}
}