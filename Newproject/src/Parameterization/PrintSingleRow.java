package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleRow 

{
   public static void main(String[]args) throws EncryptedDocumentException, IOException 
   
   {
	   FileInputStream file = new FileInputStream("C:\\\\Users\\\\manis\\\\OneDrive\\\\Book456789.xlsx");
	       Sheet sheet1 = WorkbookFactory.create(file).getSheet("manish");
	        
	      short cellsize = sheet1.getRow(0).getLastCellNum();
	      System.out.println(cellsize);
	      
	      
		for(int i = 0; i<cellsize; i++) 
	      {
	    	 String data =  sheet1.getRow(0).getCell(i).getStringCellValue();
		       System.out.print(" "+data);

	      }
		
   }
   
}
