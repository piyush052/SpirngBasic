package com.piyush.SpirngBasic.repo;

import com.piyush.SpirngBasic.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomPersonRepo implements CustomRepo{

    @Autowired
    EntityManager entityManager ;
    @Override
    public List<Person> findAll(Sort var1) {

        entityManager.getCriteriaBuilder().and();
        return null;
    }
}
