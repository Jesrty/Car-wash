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
            card.balance((idid-1));
         }
         else if(imp2.equals("wash")){
            System.out.println("type 1 for Student wash: 99,95 , type 2 for slave work wash: 199,95 , type 3 for Trump wash: 999,95, type 4 for no wash");
            int imp3 = s.nextInt();
            if(imp3 == 1){
               type.type1((idid-1));
            }
            if(imp3 == 2){
               type.type2((idid-1));
            }
            if(imp3 == 3){
               type.type3((idid-1));
            }
            if(imp3 == 4){
               System.out.println("Well fuck you then");
            }
         }
      }
      else if(imp.equals("customer")){
         card.card();
      
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }


}