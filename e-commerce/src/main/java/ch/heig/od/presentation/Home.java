package ch.heig.od.presentation;

import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Produit;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class Home extends HttpServlet {

    @Inject
    private EcommerceDao service;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Produit> produits = service.listProduits();
        request.setAttribute("produit", produits);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
