package com.sudharsan.mappingsdemo.dao;

import com.sudharsan.mappingsdemo.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Repository;

@Repository
public class AppDaoImpl implements AppDao{

    //define entity manager
    private EntityManager entityManager;

    public AppDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Instructor theinstructor) {
        entityManager.persist(theinstructor);


    }



    @Override
    public Instructor findById(int theId){
        return entityManager.find(Instructor.class,theId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {
        Instructor temp=entityManager.find(Instructor.class,theId);

        entityManager.remove(temp);
    }
}
