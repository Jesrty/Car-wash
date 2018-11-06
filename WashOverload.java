import java.util.*;
import java.io.*;
public class WashOverload{

   private String placeHolder;
   private int i;
   

   public void fileWrite(File file, double balanceChange, int idid)throws FileNotFoundException{
   
   Scanner s = new Scanner(file);
               
         while(s.hasNextLine()){
            i++;
            placeHolder = s.nextLine();
            
         }
         String[] customerHolder = new String[i];
         s.close();
      
         Scanner ss = new Scanner(file);
         for(int p = 0; p<i; p++){
            customerHolder[p] = ss.nextLine();
         }
         
         String[] customerSplit = customerHolder[idid].split(",");
         
         double[] customerChange = new double[1];
         customerChange[0] = (Double.parseDouble(customerSplit[2]) + balanceChange);
         
         customerHolder[idid] = customerSplit[0] + "," + customerSplit[1] + "," + customerChange[0];
         
      
         PrintStream outPrint = new PrintStream(file);
      
         for(int h = 0; h<i;h++){
            outPrint.println(customerHolder[h]);
         }
         ss.close();  
         
         System.out.println("your balance is now: " + customerChange[0]);
   
   
   
   
   }



}