package com.piyush.SpirngBasic.repo;

import com.piyush.SpirngBasic.entities.Person;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CustomRepo {
    List<Person> findAll(Sort var1);
}
