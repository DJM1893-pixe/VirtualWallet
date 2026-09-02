package app.service;

import app.domain.DocumentTypeEnum;
import app.domain.Person;

import java.util.List;

public class PersonService {
    public Person createPerson(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean isActive, String ocupaciotion, Double salary) {
        return null; //Placeholder return
    }

    public Person getPersonById(Integer id){
        // logic to retrive a person by ID
        return null;
    }
    public List<Person> getAllPersons(){
        return null;
    }

    public Person updatePerson(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean isActive, String ocupaciotion, Double salary){
        return null;
    }
}
