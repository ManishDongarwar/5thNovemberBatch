package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class StringinputFile 

{
  public static void main(String[] args) throws EncryptedDocumentException, IOException 
  
  {
	FileInputStream file = new FileInputStream("C:\\Users\\manis\\OneDrive\\Book456789.xlsx");
	
          String data = WorkbookFactory.create(file).getSheet("manish")
	      .getRow(0).getCell(2).getStringCellValue();
          
          System.out.println(data);
  }
  
}
