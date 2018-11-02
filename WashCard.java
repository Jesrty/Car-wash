import java.io.*;
import java.util.*;
public class WashCard{

   private double balance = 0;
   Scanner s = new Scanner(System.in);
   private double impAmount;
   private String imp1;
   File file = new File("customer.txt");
   Customer_v2 c = new Customer_v2();
   int i;
   String lortlort;
   
   
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
      System.out.println("1");
         Scanner s = new Scanner(file);
               
         while(s.hasNextLine()){
            i++;
            System.out.println(i);
            lortlort = s.nextLine();
            
         }
         String[] test = new String[i];
         System.out.println("1");
         s.close();
      
         Scanner ss = new Scanner(file);
         for(int p = 0; p<i; p++){
            test[p] = ss.nextLine();
         }
      
         System.out.println("2");
         
         String[] blabla = test[idid].split(",");
         System.out.println(blabla[0] + "," + blabla[1] + "," + blabla[2]);
         //double bise = (double)Double.parseDouble(blabla[2]);
         
         // DET HER ER PÅ EN ELLER ANDEN MÅDE EN STRING!!!
         blabla[2] = (blabla[2] + impAmount);
         test[idid] = blabla[0] + "," + blabla[1] + "," + blabla[2]; 
         
      
         
      
         PrintStream outPrint = new PrintStream(file);
      
         for(int h = 0; h<i;h++){
            outPrint.println(test[h]);
         }
         ss.close();  
         
         
         
         System.out.println("your balance is now: " + blabla[2]);
         
      }
      
      else if(s.next().equals("no")){
         System.out.println("No amount was added, your balance is now: " + balance);
      }
      
      
      
      
     
   }
  
   
   public void check(){
      System.out.println("your balance is: " + balance);
   }

   public double getBalance(){
      return balance;
   }
   
   public void setBalance(double price){
      this.balance = this.balance - price;
   }


}