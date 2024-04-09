package Models.Repositories;
import Models.Entities.Transportista;
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
public class TransportistaRepository extends BaseRepository<Transportista, Long>{
    
    public TransportistaRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
