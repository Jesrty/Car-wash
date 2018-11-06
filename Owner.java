import java.util.*;
import java.io.*;
public class Owner{

   public static void main(String[] args) throws FileNotFoundException{
   
      WashCard card = new WashCard();
      WashType type = new WashType();
      String imp;
      String imp1;
      int idid = 0;
      Scanner s = new Scanner(System.in);
      
      System.out.println("Pick New customer or ID");
      imp = s.nextLine();
      if(imp.equals("id")){
         System.out.println("Type your id number");
         idid = s.nextInt();
         System.out.println("Pick charge, check balance, wash");
         imp1 = s.nextLine();
         String imp2 = s.nextLine();
         if(imp2.equals("charge")){
            card.charge((idid-1));
         }
         else if(imp2.equals("balance")){
            
         }
      }
      else if(imp.equals("new customer")){
      
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }


}