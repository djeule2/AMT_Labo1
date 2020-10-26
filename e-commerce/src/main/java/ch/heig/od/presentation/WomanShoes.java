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

@WebServlet("/CatWoman")
public class WomanShoes  extends HttpServlet {
    @Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Produit> produits = service.listProduitParCategorie(2);
        request.setAttribute("produit", produits);
        request.getRequestDispatcher("/WEB-INF/view/womanShoes.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
