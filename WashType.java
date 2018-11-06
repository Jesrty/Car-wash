import java.io.*;
import java.util.*;
public class WashType extends WashOverload{

   String[] type = new String[3];
   WashCard card = new WashCard();
   File file = new File("Statistic.txt");
   File file1 = new File("customer.txt");
   int add1;
      
   public void type1(int idid) throws FileNotFoundException{
      System.out.println("You picked student wash: 99,95");
      fileWrite(file1, -99.95, idid);
      
      Scanner s = new Scanner(file);
      type[0] = s.next();
      add1 = s.nextInt();
      add1++;
      type[1] = s.nextLine();
      type[2] = s.nextLine();
      PrintStream outPrint = new PrintStream(file);
      outPrint.println(type[0] + " " + add1 + type[1] + type[2]);
      
      s.close(); 
   }
   
   public void type2(int idid) throws FileNotFoundException{
      System.out.println("You picked slave work wash: 199,95");
      fileWrite(file1, -199.95, idid);  
      
      PrintStream outPrint = new PrintStream(file);
      Scanner s = new Scanner(file);
      type[0] = s.nextLine();
      type[1] = s.next();
      add1 = s.nextInt();
      add1++;
      type[2] = s.nextLine();
      outPrint.println(type[0] + type[1] + add1 + type[2]);
      s.close();
       
   }
   
   public void type3(int idid) throws FileNotFoundException{
      System.out.println("You picked Trump wash: 999,95");
      fileWrite(file1, -999.95, idid);   
      
      PrintStream outPrint = new PrintStream(file);
      Scanner s = new Scanner(file);
      type[0] = s.nextLine();
      type[1] = s.nextLine();
      type[2] = s.next();
      add1 = s.nextInt();
      add1++;
      outPrint.println(type[0] + type[1] + type[2] + add1);
      s.close();
      
   }
   

}