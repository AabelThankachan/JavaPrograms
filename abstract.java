import java.util.*;
abstract class Shape{
     abstract void numberOfSides();
}

class Rectangle extends Shape{
     void numberOfSides()
     {
         System.out.println("Rectangle has 4 sides");
     }        
}     

class Triangle extends Shape{
     void numberOfSides()
     {
         System.out.println("Triangle has 3 sides");
     }        
}    

class Hexagon extends Shape{
     void numberOfSides()
     {
         System.out.println("Hexagon has 6 sides");
     }        
}    

class Abstract
{
     public static void main(String args[])
     {
          Scanner s=new Scanner(System.in);
          int choice=0;
          while (choice!=4)
          {
             System.out.print("Enter choice: \n1.Rectangle \n2.Triangle \n3.Hexagon \n4.Exit \n");
             choice=s.nextInt();
             switch(choice)
             {
                case 1:
                       Rectangle obj1=new Rectangle();
                       obj1.numberOfSides();
                       break;
                case 2:
                      Triangle obj2=new Triangle();
                      obj2.numberOfSides();
                      break;
                case 3:
                      Hexagon obj3=new Hexagon();
                      obj3.numberOfSides();
                      break;
                case 4:
                      break;
                default:
                      System.out.println("Enter valid choice:");
             }
        }                           
     }
}                             
                    
        
         












