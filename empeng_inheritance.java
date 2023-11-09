import java.util.*;
class Employee{
       void display()
       {
          System.out.println("Name of class is Employee");
       }
       
       void calcSalary()
       {
          System.out.println("Salary of employee is 10000");
       }
}

class Engineer extends Employee{
             void display()
             {
                  super.display();
                  super.calcSalary();     
                  System.out.println("Name of class is Engineer");
             }     
             
             void calcSalary()
             {
                  System.out.println("Salary of engineer is  20000");     
             }
                 
             public static void main(String ars[]){
                 Engineer e=new Engineer();
                 e.display();
                 e.calcSalary();
             }
}             
                              
