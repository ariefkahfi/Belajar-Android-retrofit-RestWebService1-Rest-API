package com.arief.rest.services;

import com.arief.rest.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arief on 9/10/2017.
 */
@Repository
public interface PersonRepo extends CrudRepository<Person,Integer>{

}
