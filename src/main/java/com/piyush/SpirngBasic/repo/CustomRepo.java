package com.piyush.SpirngBasic.repo;

import com.piyush.SpirngBasic.entities.Person;

import java.util.List;

public interface CustomRepo {
    List<Person> findAll();
}
