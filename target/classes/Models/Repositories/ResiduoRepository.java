
import Models.Entities.Residuo;
import Models.Repositories.BaseRepository;
import java.io.Serializable;
import org.hibernate.SessionFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reinaldo Quintana
 */
public class ResiduoRepository extends BaseRepository<Residuo, Long>{
    
    public ResiduoRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
