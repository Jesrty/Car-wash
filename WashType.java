import java.io.*;
import java.util.*;
public class WashType{

   String[] type = {"type1", "type2", "type3"};
   WashCard card = new WashCard();
   File file = new File("Statistic.txt");
   int add1;
      
   public void type1() throws FileNotFoundException{
      card.setBalance(99.95);
      System.out.println("You picked Student wash\nThe price is 99,95 your balance is now: " + card.getBalance());
      
      PrintStream outPrint = new PrintStream(file);
      Scanner s = new Scanner(file);
      type[0] = s.next();
      add1 = s.nextInt();
      add1++;
      type[1] = s.nextLine();
      type[2] = s.nextLine();
      outPrint.println(type[0] + add1 + type[1] + type[2]);
      s.close(); 
   }
   
   public void type2() throws FileNotFoundException{
      card.setBalance(199.95);
      System.out.println("You picked slave work wash\nThe price is 199,95 your balance is now: " + card.getBalance());  
      
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
   
   public void type3() throws FileNotFoundException{
      card.setBalance(999.95);
      System.out.println("You picked Trump wash\nThe price is 999,95 your balance is now: " + card.getBalance());   
      
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