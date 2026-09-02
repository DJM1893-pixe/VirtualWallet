package app.domain;

public class Person extends User {
    private String ocupaciotion;
    private Double salary;

    public Person() {
        super();
    }

    public Person(Integer id, String name, String lastName, DocumentTypeEnum documentType, String email, String password, boolean isActive, String ocupaciotion, Double salary) {
        super(id, name, lastName, documentType, email, password, isActive);
        this.ocupaciotion = ocupaciotion;
        this.salary = salary;
    }

    public String getOcupaciotion() {
        return ocupaciotion;
    }

    public void setOcupaciotion(String ocupaciotion) {
        this.ocupaciotion = ocupaciotion;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ocupaciotion='" + ocupaciotion + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
