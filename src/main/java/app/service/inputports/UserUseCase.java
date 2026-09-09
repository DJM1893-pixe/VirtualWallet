package app.service.inputports;

import app.domain.Person;
import java.util.List;

public interface UserUseCase {

    public Person createPerson(Integer id, String name, String lastName, String documentType, String email, String password, boolean state, String occupation, double salary);

    public Person getPersonById(Integer id);

    public List<Person> getAllPersons();

    public Person updatePerson(Integer id, String name, String lastName, String documentType, String email, String password, boolean state, String occupation, double salary);

    public void deletePerson(Integer id);
}