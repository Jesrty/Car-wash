import java.util.*;
import java.io.*;
public class Customer_v2{

   private int id = 1;
   private String thisLine;
   File file = new File("customer.txt");

   public void setID() throws FileNotFoundException{
      Scanner s = new Scanner(file);
      while(s.hasNextLine()){
         id++;
         thisLine = s.nextLine();
      }
      s.close();
   }
   
   public int getID(){
      return id;
   }
   
}