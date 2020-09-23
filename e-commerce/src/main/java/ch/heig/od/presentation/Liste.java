package ch.heig.od.presentation;

import ch.heig.od.business.ContactService;
import ch.heig.od.model.Contact;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/liste")
public class Liste extends HttpServlet {
    private ContactService service;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        service = (ContactService) getServletContext().getAttribute("service");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contact> contacts = service.getContacts();
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/WEB-INF/pages/liste.jsp").forward(request, response);
    }
}
