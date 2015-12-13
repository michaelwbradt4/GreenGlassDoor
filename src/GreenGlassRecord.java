import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;
public class GreenGlassRecord {

	private Formatter gformat = new Formatter();
	
	protected void openfile(){
		try{
			gformat = new Formatter("GreenGlassWords.txt");
		}//end try
		
		catch(Exception e){
			System.out.println("An error ocurred");
		}//end catch
	}//end method openfile
	
	
	protected void addRecords(String passed){
		gformat.format("%s%n",passed);
	}//end method addRecords
	
	protected void closefile(){
		gformat.close();
	}//end closefile
	
}//end class GreenGlassRecord
