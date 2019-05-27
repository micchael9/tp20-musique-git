package controllers;

import daos.MusiqueDAO;
import models.Musique;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Les ressources de Type Musique seront accessibles par l'URL "rest/musiques/*"
 */
@Path("/musiques")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class MusiqueREST {

    @EJB
    MusiqueDAO musiqueDAO;

    @GET
    public List<Musique> getAllMusiques() {
        return musiqueDAO.findAll();
    }

    @GET
    @Path("{id}")
    public Musique getMusique(@PathParam("id") int id) {
        return musiqueDAO.findById(id);
    }
}
