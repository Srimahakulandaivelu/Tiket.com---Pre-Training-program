import myList.MyList;
import myList.GenericMyList;
import employee.Employee;

import java.util.Date;

public class Main{
    public static void main(String[] args){

        //initializing a integer array using MyList class

        MyList intList = new MyList();

        intList.add(10);
        intList.add(20);
        intList.add(30);

        intList.display();

        intList.deleteByValue(20);

        intList.display();

        //initializing a generic list with string as type imput

        GenericMyList<String> stringList = new GenericMyList<>();

        stringList.add("Java");
        stringList.add("CPP");

        stringList.display();

        //initializing a generic list with Employee as type input

        GenericMyList<Employee> employeeList = new GenericMyList<>();

        Employee emp1 = new Employee("1", "maha", 20, new Date());
        Employee emp2 = new Employee("2", "abi", 24, new Date());

        employeeList.add(emp1);
        employeeList.add(emp2);

        employeeList.display();
    }
}