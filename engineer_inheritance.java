class Employee {
    void display() {
        System.out.println("Name of class is Employee");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void display_employee() {
        super.display();
        super.calcSalary();
    }

    void display() {
        System.out.println("Name of class is Engineer");
    }

    void calcSalary() {
        System.out.println("Salary of engineer is 20000");
    }
}

class engineer_inheritance {
    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.display_employee();
        e.display();
        e.calcSalary();
    }
}