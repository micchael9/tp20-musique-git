package daos;

import models.Musique;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MusiqueDAO {

    @PersistenceContext
    EntityManager em;

    public MusiqueDAO() {
    }

    public Musique create(Musique musique) {
        em.persist(musique);
        return musique;
    }

    public List<Musique> findAll() {
        return em.createQuery("select m from Musique m").getResultList();
    }

    public Musique findById(int id) {
        return em.find(Musique.class, id);
    }
}
