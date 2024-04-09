package Models.Repositories;

import Models.Entities.Tratamiento;
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
public class TratamientoRepository extends BaseRepository<Tratamiento, Long>{
    
    public TratamientoRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    
}
