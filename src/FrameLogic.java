import javax.swing.JOptionPane;
import java.util.Scanner;

public class FrameLogic extends SuperGlassClass{

public static void FrameLogic(String word){
	
	 /*System.out.println("Enter word: ");
     Scanner scanner = new Scanner(System.in);
     String word = scanner.nextLine();
     */
     boolean found=false;
     for (int i = 0; i < word.length()-1; i++) {
         if (word.charAt(i) == word.charAt(i+1)) {
             found=true;
             break;
         } 
         }
     
     
     if(found){
         //System.out.println("Yes! this can pass through the green glasss door!");
    	 
    	 JOptionPane.showMessageDialog(null, "Yes! this can pass through the green glasss door!");
    	 GreenGlassRecord write = new GreenGlassRecord();
    	 write.openfile();
    	 write.addRecords(word);
    	 write.closefile();
    	 int total = money++;
    	 System.out.println(money);
    }//end if
     else
         //System.out.println("Sorry, This cannot pass through the green glass door");
    	 JOptionPane.showMessageDialog(null,"Sorry, This cannot pass through the green glass door");
	
     
}//end constructor
}//end class FrameLogic