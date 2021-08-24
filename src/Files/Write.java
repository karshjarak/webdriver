package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write {

	private static final String cell1 = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\karsh\\Desktop\\New folder\\write.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Workbook w1 = WorkbookFactory.create(fis);

		org.apache.poi.ss.usermodel.Sheet sheet = w1.getSheet("karshak");

		for (int i = 0; i < sheet.getLastRowNum()+1; i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				Cell cell1 = row.getCell(j);
				
				
				System.out.println(cell1.getStringCellValue());

			}

		}
	}
}
