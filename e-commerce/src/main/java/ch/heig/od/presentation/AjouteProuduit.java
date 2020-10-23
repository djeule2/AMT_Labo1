package ch.heig.od.presentation;

import ch.heig.od.business.ContactService;
import ch.heig.od.business.dao.EcommerceDao;
import ch.heig.od.model.Contact;
import ch.heig.od.model.Produit;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ajoute")
public class AjouteProuduit extends HttpServlet {
@Inject
    private EcommerceDao service;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/ajoute.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomProduit = request.getParameter("nomProduit");
        String idProduit = request.getParameter("idProduit");
        int prixProduit = request.getIntHeader("prixProduit");
        String categorie = request.getParameter("categorie");
        String description = request.getParameter("description");

        List<String> errors = new ArrayList<>();
        if (nomProduit == null || nomProduit.trim().equals("")) {
            errors.add("Le nom doit être renseigné");
        }
        if (idProduit == null || idProduit.trim().equals("")) {
            errors.add("Le idProduit doit être renseigné");
        }
        if (categorie == null || categorie.trim().equals("")) {
            errors.add("Le idProduit doit être renseigné");
        }

        if (description == null || description.trim().equals("")) {
            errors.add("La description doit être renseigné");
        }

        if (nomProduit == null || nomProduit.trim().equals("")) {
            errors.add("Le prix du produit doit être renseigné");
        }

        request.setAttribute("nomProduit", nomProduit);
        request.setAttribute("idProduit", idProduit);
        request.setAttribute("categorie", categorie);
        request.setAttribute("prixProduit", prixProduit);
        request.setAttribute("description", description);
        request.setAttribute("idProduit", idProduit);

        if (errors.size() == 0) {
            service.addProduit(new Produit(idProduit, prixProduit, nomProduit, description, categorie ));
            response.sendRedirect(request.getContextPath() + "/liste");
        } else {
            request.setAttribute("errors", errors);
            request.getRequestDispatcher("/WEB-INF/pages/ajoute.jsp").forward(request, response);
        }

    }

}
