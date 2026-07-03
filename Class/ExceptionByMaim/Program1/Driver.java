package ExceptionByMaim.Program1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", 101, 22, 12);
        Student s2 = new Student("Ram", 102, 20, 11);
        Student s3 = new Student("Rachit", 103, 19, 10);

        List<Student> l = new ArrayList<>();

        l.add(s3);
        l.add(s2);
        l.add(s1);

        System.out.println("Enter your 'Y' to start ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        switch (choice.toLowerCase()) {
            case "y":
                searchStudent(l);
                break;

            default:
                break;
        }
        sc.close();
    }

    public static void searchStudent(List<Student> l) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id : ");
        int inputId = sc.nextInt();
        boolean flag = false;
        try {
            for (Student obj : l) {
                int id = obj.getId();
                if (inputId == id) {
                    System.out.println("Id : " + obj.getId() + "\tName : " + obj.getName() + "\tAge : " + obj.getAge()
                            + "\tClass : " + obj.getStudentClass());
                    flag = true;
                }

            }
            if (flag == false) {
                throw new Exception("id does not match any from student");
            }
        } catch (Exception e) {
            System.out.print(e);
        } finally {
            sc.close();
        }
    }

}
