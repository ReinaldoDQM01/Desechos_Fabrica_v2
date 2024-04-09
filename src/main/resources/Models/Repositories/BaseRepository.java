package Models.Repositories;

import Models.Entities.BaseEntity;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reinaldo Quintana
 */
public abstract class BaseRepository<T extends BaseEntity, ID extends Serializable> implements IBaseRepository<T , ID>{
    private final SessionFactory sessionFactory;
    private final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BaseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.entityClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public T save(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(entity);
        tx.commit();
        session.close();
        return entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        Session session = sessionFactory.openSession();
        T entity = session.get(entityClass, id);
        session.close();
        return Optional.ofNullable(entity);
    }

    @Override
    public List<T> findAll() {
        Session session = sessionFactory.openSession();
        List<T> entities = session.createQuery("from " + entityClass.getName(), entityClass).list();
        session.close();
        return entities;
    }

    @Override
    public void delete(T entity) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(entity);
        tx.commit();
        session.close();
    }
}
