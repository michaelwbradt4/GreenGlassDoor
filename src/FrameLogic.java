import javax.swing.JOptionPane;
import java.util.Scanner;
public class FrameLogic {

public static void FrameLogic(String word){
	
	 /*System.out.println("Enter word: ");
     Scanner scanner = new Scanner(System.in);
     String word = scanner.nextLine();
     */
     int i = 0;
     boolean found=false;
     for (i = 0; i < word.length()-1; i++) {
         if (word.charAt(i) == word.charAt(i+1)) {
             found=true;
             break;
         } 
         }
     if(found){
         System.out.println("Yes! this can pass through the green glasss door!");
     }
     else
         System.out.println("Sorry, This cannot pass through the green glass door");
	
	
     
}//end constructor
}//end class FrameLogic
