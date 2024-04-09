package Models.Repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Reinaldo Quintana
 */


import Models.Entities.BaseEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IBaseRepository<T extends BaseEntity, ID extends Serializable> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void delete(T entity);
}
