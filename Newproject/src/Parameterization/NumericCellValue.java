package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericCellValue 


{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	  
	  {
		FileInputStream file = new FileInputStream("C:\\Users\\manis\\OneDrive\\Book456789.xlsx");
		
	       double data = WorkbookFactory.create(file).getSheet("manish")
		      .getRow(1).getCell(3).getNumericCellValue();
	       
	       System.out.println(data);
	       
      }

}