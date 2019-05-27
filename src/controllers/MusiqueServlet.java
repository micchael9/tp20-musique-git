package controllers;

import daos.MusiqueDAO;
import models.Musique;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.MusiqueServlet", urlPatterns = "")
public class MusiqueServlet extends HttpServlet {

    @EJB
    MusiqueDAO musiqueDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String artiste = request.getParameter("artiste");
        String titre = request.getParameter("titre");
        String dureeString = request.getParameter("duree");
        int duree = Integer.parseInt(dureeString);

        Musique musique = new Musique(artiste, titre, duree);

        musiqueDAO.create(musique);
        System.out.println("controllers.MusiqueREST créée: " + musique);

        response.sendRedirect("./?success=true");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Musique> musiqueList = musiqueDAO.findAll();

        musiqueList.forEach((Musique musique) -> {
            System.out.println("models.controllers.MusiqueREST: " + musique.getTitre());
        });

        request.setAttribute( "musiqueList", musiqueList);

        request.getRequestDispatcher("musiques.jsp")
            .forward(request, response);
    }
}
