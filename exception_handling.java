import java.util.*;
public class exception_handling{
   
   static void checkEligibility() throws ArithmeticException
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter your age:");
       int age=s.nextInt();
       if(age<18)
       {
          throw new ArithmeticException("Student not eligible for voting");
       }
       else
       {
          System.out.println("You can vote");
       }
   } 
   
   public static void main(String args[]){
      Scanner s=new Scanner(System.in);                        
      try{
          System.out.println("Enter string:");
          String str=s.nextLine();
          int i=Integer.parseInt(str);
          System.out.println("Value after conversion: "+i);
          System.out.println("Enter two numbers:");
          int a=s.nextInt();
          int b=s.nextInt();
          System.out.println("Quotient is "+ a/b);
      } 
      catch(NumberFormatException e)
      {
          System.out.println("Number Format Exception: converting character to digit");
      } 
      catch(ArithmeticException e) 
      {
          System.out.println("Arithmetic Exception: Cannot divide by zero");
      }  
      finally
      {
          checkEligibility(); 
          System.out.println("Exiting the program...");
      }    
             
   }
}      
