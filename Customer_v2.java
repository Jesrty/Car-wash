import java.util.*;
import java.io.*;
public class Customer_v2{

//   private String name;
   private int id = 1;
//   private int i;
//   private WashCard[] card = new WashCard[i];
   File file = new File("Customer.txt");

   public void setID() throws FileNotFoundException{
      Scanner s = new Scanner(file);
      while(s.hasNextLine()){
         id++;
      }
      s.close();
   }
   
   public int getID(){
      return id;
   }
   
}