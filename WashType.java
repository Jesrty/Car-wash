import java.io.*;
import java.util.*;
public class WashType extends WashOverload{

   String[] type = new String[3];
   WashCard card = new WashCard();
   File file = new File("Statistic.txt");
   File file1 = new File("customer.txt");
   int add1;
   
   // Subtracts the "student wash" from the customer balance and adds 1 to statistic.txt  
   public void type1(int idid) throws FileNotFoundException{
      System.out.println("You picked student wash: 99,95");
      fileWrite(file1, -99.95, idid); //fileWrite methode from WashOverload
      
      // Copies and adds to statistic.txt 
      if(getWow() != 1){
         Scanner s = new Scanner(file);
         String s1 = s.next();
         int add = s.nextInt();
         add++;
         String s2 = s.nextLine();
         String s3 = s.nextLine();
         String s4 = s.nextLine();
         PrintStream outPrint = new PrintStream(file);
         outPrint.println(s1 + " " + add);
         outPrint.println(s3);
         outPrint.println(s4);
      
         s.close(); 
      }
      setWow(0);
   }
   // Subtracts the "slave work wash" from the customer balance and adds 1 to statistic.txt     
   public void type2(int idid) throws FileNotFoundException{
      System.out.println("You picked slave work wash: 199,95");
      fileWrite(file1, -199.95, idid);  
      
      if(getWow() != 1){
         Scanner s = new Scanner(file);
         String s1 = s.nextLine();
         String s2 = s.next();
         int add = s.nextInt();
         add++;
         String s3 = s.nextLine();
         String s4 = s.nextLine();
         PrintStream outPrint = new PrintStream(file);
         outPrint.println(s1);
         outPrint.println(s2 + " " + add);
         outPrint.println(s4);
      
         s.close();
      }
      setWow(0);
   }
   // Subtracts the "Trump wash" from the customer balance and adds 1 to statistic.txt     
   public void type3(int idid) throws FileNotFoundException{
      System.out.println("You picked Trump wash: 999,95");
      fileWrite(file1, -999.95, idid);   
      
      if(getWow() != 1){
         Scanner s = new Scanner(file);
         String s1 = s.nextLine();
         String s2 = s.nextLine();
         String s3 = s.next();
         int add = s.nextInt();
         add++;
         String s4 = s.nextLine();
         PrintStream outPrint = new PrintStream(file);
         outPrint.println(s1);
         outPrint.println(s2);
         outPrint.println(s3 + " " + add);
      
         s.close();
      }
      setWow(0);
   }
   

}