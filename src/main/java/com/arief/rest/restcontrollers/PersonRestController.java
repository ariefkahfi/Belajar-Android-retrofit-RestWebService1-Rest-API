package com.arief.rest.restcontrollers;

import com.arief.rest.domain.Person;
import com.arief.rest.services.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Arief on 9/10/2017.
 */
@RestController
public class PersonRestController {


    @Autowired
    private PersonRepo personRepo;


        @RequestMapping(value = "/person",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
        public ResponseEntity insertRequest(@RequestBody Person person){
            try{
              personRepo.save(person);

              ResponseEntity<String> response = new ResponseEntity<String>("Query OK",HttpStatus.OK);



              return  response;

            }catch (DuplicateKeyException ex){
              return new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
            }catch (Exception ex){
              return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
            }
        }


        @RequestMapping(value = "/person",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
        public List<Person> getAllPerson(){
           return (List<Person>) personRepo.findAll();
        }

}
