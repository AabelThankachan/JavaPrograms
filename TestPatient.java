
//patient details using default and overloaded constructor
import java.util.*;

class Patient {
    int idNumber;
    int age;
    int bloodData;

    Patient() {
        idNumber = 0;
        age = 0;
        bloodData = 0;
    }

    Patient(int p, int q, int r) {
        idNumber = p;
        age = q;
        bloodData = r;
    }

    int get_IdNumber() {
        return idNumber;
    }

    int get_age() {
        return age;
    }

    int get_bloodData() {
        return bloodData;
    }
}

class TestPatient {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Patient details using Default Constructor");
            Patient p1 = new Patient();
            System.out.println("Patient id number is " + p1.idNumber);
            System.out.println("Patient age is " + p1.age);
            System.out.println("Patient blood data is " + p1.bloodData);

            System.out.println("Patient details using Constructor Overloading");
            System.out.println("Enter patient id:");
            int x = s.nextInt();
            System.out.println("Enter patient age:");
            int y = s.nextInt();
            System.out.println("Enter patient blood data:");
            int z = s.nextInt();
            Patient p2 = new Patient(x, y, z);
            int id = p2.get_IdNumber();
            int age = p2.get_age();
            int bloodData = p2.get_bloodData();
            System.out.println("Patient id number is " + id);
            System.out.println("Patient age is " + age);
            System.out.println("Patient blood data is " + bloodData);
        }
    }
}