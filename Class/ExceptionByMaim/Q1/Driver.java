package ExceptionByMaim.Q1;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        Employee e1 = new Employee(01, "Suraj", 22, 500000);
        Employee e2 = new Employee(02, "Ram", 23, 4000009.986);
        Employee e3 = new Employee(03, "Rahul", 45, 84553);
        Employee e4 = new Employee(04, "Rajat", 16, 76753);
        Employee e5 = new Employee(05, "Joya", 20, 766302);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        int Youngest = youngestEmp(emp);
        secondYoungestEmp(emp, Youngest);
        HighestSalary(emp);

    }

    public static int youngestEmp(List<Employee> emp) {
        int youngest = Integer.MAX_VALUE;
        for (Employee e : emp) {
            if (e.getAge() < youngest) {
                youngest = e.getAge();
            }
        }
        System.out.println("The Youngest employee is : " + youngest);
        return youngest;
    }

    public static void secondYoungestEmp(List<Employee> emp, int youngest) {
        int secondYEmpAge = 0;
        for (Employee e : emp) {
            if (youngest != e.getAge()) {
                secondYEmpAge = e.getAge();
                if (e.getAge() > youngest && e.getAge() < secondYEmpAge) {
                    secondYEmpAge = e.getAge();
                }
            }
        }
        System.out.println("Second youngest Employee : " + secondYEmpAge);
    }

    public static void HighestSalary(List<Employee> emp) {
        double hSallary = Double.MIN_VALUE;
        for (Employee e : emp) {
            if (hSallary < e.getSallary()) {
                hSallary = e.getSallary();
            }
        }
        System.out.println("Highest sallary of Employee Group :  " + hSallary);
    }
}
