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

@WebServlet("/detail")
public class DetailProduct extends HttpServlet {
    @Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String produit = request.getParameter("produit");
        request.setAttribute("produit", produit);
        request.getRequestDispatcher("/WEB-INF/view/product-detail.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
