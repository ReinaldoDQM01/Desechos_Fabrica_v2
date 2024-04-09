package Models.Repositories;

import Models.Entities.Traslado;
import java.io.Serializable;
import org.hibernate.SessionFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Esteban Arteaga
 */
public class TrasladoRepository extends BaseRepository<Traslado, Long>{
    
    public TrasladoRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
