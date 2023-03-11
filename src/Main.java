import hospital.People.Employee;
import hospital.People.Patient;
import hospital.People.Person;

public class Main {
    public static void main(String[] args) {

        Person per = new Person("Max","Tulegenov",20,"Popular2023");
        Employee em = new Employee("Artur","Petrovich",43,"popular2023","Lechit");
        Patient pt = new Patient("Azim","Aleksei",90,"program2023","Starost");
    }
}