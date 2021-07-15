package com.piyush.SpirngBasic.repo;

import com.piyush.SpirngBasic.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
