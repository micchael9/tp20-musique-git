import daos.MusiqueDAO;
import models.Musique;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class StartupEJB {

    @EJB
    MusiqueDAO musiqueDAO;

    public StartupEJB() {
    }

    @PostConstruct
    public void init() {
        System.out.println("[i] StartupEJB start");
        Musique stairwayToHeaven = new Musique("Led Zeppelin", "Stairway to heaven", 481);
        musiqueDAO.create(stairwayToHeaven);
        System.out.println(stairwayToHeaven);
    }
}
