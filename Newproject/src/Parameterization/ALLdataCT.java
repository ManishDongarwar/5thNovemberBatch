package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ALLdataCT 

{
   public static void main(String[]args) throws EncryptedDocumentException, IOException 
   
   {
	    FileInputStream file = new FileInputStream("C:\\Users\\manis\\OneDrive\\ALLDATA(parameterization).xlsx");
	    
	   Sheet sheet1 = WorkbookFactory.create(file).getSheet("ALLDATA");
	    
	    for(int i = 0; i<=sheet1.getLastRowNum(); i++) 
	    {
	    	for(int j = 0; j<=sheet1.getRow(i).getLastCellNum()-1;j++) 
	    	{
	    		Cell cellinfo = sheet1.getRow(i).getCell(j);
	    		
	    		          CellType CT = cellinfo.getCellType();
	    		
	    		          if(CT == CellType.STRING) 
	    		          {
	    		         	 System.out.print(cellinfo.getStringCellValue()+" ");
	    		          }
	    		          
	    		          else if (CT == CellType.NUMERIC) 
	    		          
	    		          {
	    		         	 System.out.print(cellinfo.getNumericCellValue()+" ");
	    		          }
	    		          
	    		          else if (CT == CellType.BOOLEAN)
	    		          
	    		          {
	    		         	 System.out.print(cellinfo.getBooleanCellValue()+" ");
                          }
	    		          
	    		          
	    	}
	    	   
	    	System.out.println();
	    	
	    }
	    
	    
	    
	    
	    
   }
   
}
