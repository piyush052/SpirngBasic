package com.piyush.SpirngBasic.repo;

import com.piyush.SpirngBasic.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomPersonRepo implements CustomRepo{

    @Autowired
    EntityManager entityManager ;
    @Override
    public List<Person> findAll() {

        entityManager.getCriteriaBuilder().and();
        return null;
    }
}
