package app.service;

import app.domain.Person;
import app.domain.User;
import app.service.inputports.UserUseCase;

import java.util.List;
// asi se implementa la interfaz
public class PersonServiceImpl implements UserUseCase {


    @Override
    public Person createPerson(Integer id, String name, String lastName, String documentType, String email, String password, boolean state, String occupation, double salary) {
        Person person = new Person(id, name, lastName, documentType, email,String email, boolean state, String occupation, double salary);
        return person;
    }

    @Override
    public Person getPersonById(Integer id) {
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return List.of();
    }

    @Override
    public Person updatePerson(Integer id, String name, String lastName, String documentType, String email, String password, boolean state, String occupation, double salary) {
        return null;
    }

    @Override
    public void deletePerson(Integer id) {

    }
}
