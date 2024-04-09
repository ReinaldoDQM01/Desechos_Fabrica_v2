package Models.Repositories;

import Models.Entities.Vehiculo;
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
public class VehiculoRepository extends BaseRepository<Vehiculo, Long>{
    
    public VehiculoRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

}
