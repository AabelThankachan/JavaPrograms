import java.util.*;
interface Sports
{
   final float sportwt=6.0F;
   abstract void putwt();
}

class Student
{
   int rollnumber;
   void getNumber()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter roll number:");
     rollnumber=s.nextInt();
   }
   void putNumber()
   {
     System.out.println("Rollno: "+rollnumber);
   }
}

class Test extends Student
{
   float term1;
   float term2;
   void getMarks()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter term 1 marks: ");
     term1=s.nextFloat();
     System.out.println("Enter term 2 marks: ");
     term2=s.nextFloat();    
   }
   void putMarks()
   {
     System.out.println("Marks obtained");
     System.out.println("Term 1="+term1);
     System.out.println("Term 2="+term2);
   }
}

class Results extends Test implements Sports
{
  public void putwt()
  {
    System.out.println("Sports weightage="+sportwt);
    System.out.println("Total Score="+(term1+term2+sportwt)); 
  }

  public static void main(String args[]){
    Results ob=new Results();
    ob.getNumber();
    ob.getMarks();
    ob.putNumber();
    ob.putMarks();
    ob.putwt(); 
  }   
}   
        
      
   
   
   
   
   
   
   
   
   
     
     
     
            
