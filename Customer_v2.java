import java.util.*;
import java.io.*;
public class Customer_v2{

   private int id = 1;
   private String thisLine;
   File file = new File("customer.txt");
   
   //Creates new ID but counting lines (the amount of lines in the customer.txt is the ID)
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
   public void set2ID(int id){
      this.id = id;
   }
   
}