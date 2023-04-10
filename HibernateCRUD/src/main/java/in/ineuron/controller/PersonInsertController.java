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

@WebServlet("/insert")
public class PersonInsertController extends HttpServlet {
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
		// save
		Person person = new Person();
		person.setName(request.getParameter("name"));
		person.setAge(Integer.parseInt(request.getParameter("age")));
		person.setAddress(request.getParameter("address"));

		String save = personService.save(person);
		System.out.println(save);
		request.setAttribute("save", save);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./insert.jsp");
		requestDispatcher.forward(request, response);

	}
}
