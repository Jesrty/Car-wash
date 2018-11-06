import java.io.*;
import java.util.*;
public class WashCard extends WashOverload{

   private double balance = 0;
   Scanner s = new Scanner(System.in);
   private double impAmount;
   private String imp1;
   File file = new File("customer.txt");
   Customer_v2 c = new Customer_v2();
   int i;
   
   
   
   public void card() throws FileNotFoundException{
      PrintStream outPrint = new PrintStream(new FileOutputStream(file, true));
      System.out.println("type name");
      imp1 = s.nextLine();
      c.setID();
      outPrint.println(c.getID() + "," + imp1 + "," + balance);  
      System.out.println("ID: " + c.getID() + "\nName: " + imp1 + "\nBalance: " + balance);
   }


   public void charge(int idid) throws FileNotFoundException{
      System.out.println("Type the amount too deposit");
      impAmount = s.nextDouble();
      System.out.println("Are you sure type \"yes\" or \"no\"");
         
      if(s.next().equals("yes")){
         fileWrite(file, impAmount, idid);
      }
      
      else if(s.next().equals("no")){
         System.out.println("No amount was added, your balance is now: " + balance);
      }
      
      
      
      
     
   }
  
   
   public void balance(int idid) throws FileNotFoundException{
      fileWrite(file, 0, idid);
   }

}