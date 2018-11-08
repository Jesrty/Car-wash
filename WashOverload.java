import java.util.*;
import java.io.*;
public class WashOverload{

   private String placeHolder;
   private int i;
   private int wow = 0;
   private int sta1;
   private int sta2;
   private int sta3;
   private int sta4;
   private String stat1;
   private String stat2;
   private String stat3;
   
   File file2 = new File("Statistic.txt");
   
   public int getWow(){
      return wow;
   }
   public void setWow(int wow){
      this.wow = wow;
   }
   
   //Gemmer helle filen customer.txt i et array af strings også ændre en balancen på en bestem linje
   public void fileWrite(File file, double balanceChange, int idid)throws FileNotFoundException{
   
      Scanner s = new Scanner(file);
      
      //tæller antal linjer i filen customer.txt         
      while(s.hasNextLine()){
         i++;
         placeHolder = s.nextLine();
            
      }
      //laver et array der er lige så langt som antal linjer i filen customer.txt
      String[] customerHolder = new String[i];
      s.close();
      
      //sætter hver linje i filen customer.txt ligmed et af arraysne (så array [0] er lig med linje 1
      Scanner ss = new Scanner(file);
      for(int p = 0; p<i; p++){
         customerHolder[p] = ss.nextLine();
      }
      
      //splitter linjen med det intastede id op i flere arrays   
      String[] customerSplit = customerHolder[idid].split(",");
      
      //ændre balance værdien på det bestemte id   
      double[] customerChange = new double[1];
      customerChange[0] = (Double.parseDouble(customerSplit[2]) + balanceChange);
         
      customerHolder[idid] = customerSplit[0] + "," + customerSplit[1] + "," + customerChange[0];
      
      //hvis beløbet ikke bliver negativt "sletter" den den gamle fil og skriver det ind igen med ændringen i balancen   
      if(customerChange[0]>=0){
         PrintStream outPrint = new PrintStream(file);
      
         for(int h = 0; h<i;h++){
            outPrint.println(customerHolder[h]);
         }
         i=0;
         ss.close();  
         
         System.out.println("your balance is now: " + customerChange[0] + "\n");
      }
      //hvis balancen går i minus opdatere den ikke filen 
      else if(customerChange[0]<0){
         System.out.println("Du kan ikke komme i minus\n");
         wow = 1;
         i = 0;
      }
   
   
   
   }


   public void getStatistics()throws FileNotFoundException{
      Scanner s = new Scanner(file2);
      
      stat1 = s.next();
      sta1 = s.nextInt();
      stat2 = s.next();
      sta2 = s.nextInt();
      stat3 = s.next();
      sta3 = s.nextInt();
      
      sta4 = sta1 + sta2 + sta3;
   
      System.out.println("Student wash:       " + sta1 + "\t\t" + (((double)sta1/(double)sta4)*100) + "%");
      System.out.println("Slave work wash:    " + sta2 + "\t\t" + (((double)sta2/(double)sta4)*100) + "%");
      System.out.println("Trump wash:         " + sta3 + "\t\t" + (((double)sta3/(double)sta4)*100) + "%");
      System.out.println("total washes:       " + (sta1 + sta2 + sta3));
      System.out.println();
   
      s.close();
   
   }



}