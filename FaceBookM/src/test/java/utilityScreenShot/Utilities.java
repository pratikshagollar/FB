package utilityScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {

	
	 public static void takeScreenShot(WebDriver driver) throws IOException, InterruptedException 
	 {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");  
		 Date date = new Date();  
		 System.out.println(formatter.format(date));    
		
		 File  source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Pratiksha\\Desktop\\Testing Data\\Selenium\\"
         		+ "sceenshot\\test1-"+formatter.format(date)+".jpeg");	
		 
         FileHandler.copy(source, dest);
         
         
	 }

	
}
