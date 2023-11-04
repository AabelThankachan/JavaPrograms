
// printing employee details based on id
import java.util.*;

class Employee {
    int Id;
    String Emp_name;
    int Emp_age;
    String Emp_gender;
    String Emp_designation;
    double Emp_salary;
    String Emp_address;

    Employee(int id, String name, int age, String g, String d, double sal, String a) {
        Id = id;
        Emp_name = name;
        Emp_age = age;
        Emp_gender = g;
        Emp_designation = d;
        Emp_salary = sal;
        Emp_address = a;
    }

    int get_Id() {
        return Id;
    }

    String get_name() {
        return Emp_name;
    }

    int get_age() {
        return Emp_age;
    }

    String get_gender() {
        return Emp_gender;
    }

    String get_designation() {
        return Emp_designation;
    }

    double get_salary() {
        return Emp_salary;
    }

    String get_address() {
        return Emp_address;
    }
}

class employee_details {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter number of employees:");
            int n = s.nextInt();
            s.nextLine();
            Employee[] employees = new Employee[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Employee " + (i + 1) + " details:");
                System.out.println("ID:");
                int id = s.nextInt();
                s.nextLine();
                System.out.println("Name:");
                String name = s.nextLine();
                System.out.println("Age:");
                int age = s.nextInt();
                s.nextLine();
                System.out.println("Gender:");
                String g = s.nextLine();
                System.out.println("Designation:");
                String d = s.nextLine();
                System.out.println("Salary:");
                double sal = s.nextDouble();
                s.nextLine();
                System.out.println("Address:");
                String a = s.nextLine();

                employees[i] = new Employee(id, name, age, g, d, sal, a);
            }
            System.out.println("Enter employee ID to search for:");
            int searchId = s.nextInt();
            int flag = 0;

            for (Employee emp : employees) {
                if (emp.get_Id() == searchId) {
                    System.out.println("Employee Details for ID " + searchId + ":");
                    System.out.println("Name: " + emp.get_name());
                    System.out.println("Age: " + emp.get_age());
                    System.out.println("Gender: " + emp.get_gender());
                    System.out.println("Designation: " + emp.get_designation());
                    System.out.println("Salary: " + emp.get_salary());
                    System.out.println("Address: " + emp.get_address());
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Employee with ID " + searchId + " not found");
            }
        }
    }
}