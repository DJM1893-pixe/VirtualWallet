package app.view;

import app.domain.DocumentTypeEnum;
import app.domain.Person;
import app.service.helpers.setDocumentType;
import app.service.inputports.UserUseCase;

import java.util.Scanner;


public class PersonView {

    Scanner sc = new Scanner(System.in);
    private final UserUseCase userUseCase;
    PersonView(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
    // aqui se inicializa
    }
    public void createPerson() {
        System.out.println("cretig person");

        System.out.println("Ingrese el id del cliente");
        Integer id = sc.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        String name = sc.nextLine();

        System.out.println("Ingrese el apellido del cliente");
        String lastName = sc.nextLine();

        System.out.println("Ingrese el tipo de documento");
        String docType = setDocumentType.getDocumentType();

        System.out.println("ingrese el email del cliente");
        String email = sc.nextLine();

        System.out.println("ingrese el password del cliente");
        String password = sc.nextLine();

        System.out.println("ingrese el estado del cliente");
        boolean estado = sc.nextBoolean();

        System.out.println("ingrese la ocupacion del cliente");
        String ocupacion = sc.nextLine();

        System.out.println("ingrese el salario del cliente");
        double salario = sc.nextDouble();


        userUseCase.createPerson(id,name,lastName, docType, email,  password, estado, ocupacion, salario, DocumentTypeEnum, boolean);
    }

    public void  createPerson(){System.out.println("Creating Person");}
    public void  ShowPerson(){
        System.out.println("Showing person");
    }
    public void  showPersonById(){
        System.out.println("Getting person By Id");
    }
    public void  updatePerson(){
        System.out.println("Updating person");
    }
    public void  deletePerson(){
        System.out.println("Deleting person");
    }
}
