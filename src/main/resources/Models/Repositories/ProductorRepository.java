package Models.Repositories;

import Models.Entities.Productor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reinaldo Quintana
 */
@Repository
public class ProductorRepository extends BaseRepository<Productor, Long>{
    
    public ProductorRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
