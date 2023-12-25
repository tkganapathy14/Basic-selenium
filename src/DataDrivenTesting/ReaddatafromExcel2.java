package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File file = new File("./Test data DDT/data.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		System.out.println("row count is : "+sheet.getPhysicalNumberOfRows());
		System.out.println("cell count is : "+sheet.getRow(0).getPhysicalNumberOfCells());
	//	for(int row=0;row<2;row++)
		for(int row=0;row<sheet.getPhysicalNumberOfRows();row++)
		{
	//	for(int cell=0;cell<2;cell++)
			for(int cell=0;cell<sheet.getRow(0).getPhysicalNumberOfCells();cell++)
			{
				System.out.println(sheet.getRow(row).getCell(cell));
			}
		}
	}

}
