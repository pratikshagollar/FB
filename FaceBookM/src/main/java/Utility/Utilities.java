package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {

	
	 public static String getData(int a,int b) throws EncryptedDocumentException, IOException 
	 {
		 
		 
	          String path="C:\\Users\\Pratiksha\\Desktop\\Testing Data\\Selenium\\Book1.xlsx";
	          FileInputStream file = new FileInputStream(path);
	           Workbook w= WorkbookFactory.create(file);
	           System.out.println(file);
	           String value ="";
	    
	         try
	         {
	        	   System.out.println("first trty");
	               value =w.getSheet("Test").
	     	       getRow(a).getCell(b).getStringCellValue();
	              
	          }
	         catch(NullPointerException n)
	         {
	        	 
	        	 System.out.println(value);
	        	 double d =w.getSheet("Test").
	     	     getRow(a).getCell(a).getNumericCellValue(); //1 1
	        	 long no =(long) d;
	        	 value = Long.toString(no);
	        	 
             }
	         
	         
	         catch(IllegalStateException n)
	         {
	        	 
	        	 System.out.println(value);
	        	 double d =w.getSheet("Test").
	     	     	    getRow(a).getCell(b).getNumericCellValue(); 
	        	 
	        	   long no =(long) d;
	        	   value = Long.toString(no);
        	 
             }
	         catch(Exception n)
        	 {	        	
	        	 
	        	 n.printStackTrace();
	        	 n.toString();
		        	 
        	 }
	         
			return value;
	         

		    
	 }
	 
	
}
