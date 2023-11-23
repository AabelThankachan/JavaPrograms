import java.io.*;
import java.util.Scanner; 
public class file_handling{
   public static void main(String args[]) throws FileNotFoundException
   {
      String f1="input.txt";
      String f2="output.txt";
      try(FileInputStream inputStream=new FileInputStream(inputFile)){
        int data;
        while ((data=inputStream.read())!=-1){
           System.out.print((char)data);
           
           try(FileOutputStream outputStream=new FileOutputStream(outputFile,true)){
              outputStream.write(data);
           }catch(IOException e){
              e.printStackTrace();
           }      
        }
      }catch(IOException e){
              e.printStackTrace();
      }
   }
}              
      
           
      
      


