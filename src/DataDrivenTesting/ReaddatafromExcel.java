package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File file = new File("./Test data DDT/usname.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		String value = row.getCell(1).toString();
		System.out.println(value);
		
		//OR
		
		System.out.println(WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).toString());
	}

}
