package Models.Repositories;

import Models.Entities.Envase;
import java.io.Serializable;
import org.hibernate.SessionFactory;

public class EnvaseRepository extends BaseRepository<Envase, Long> {
    
    public EnvaseRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }    
}
