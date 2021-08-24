package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook w1 = new XSSFWorkbook();

		XSSFSheet sheet = w1.createSheet("karshak");
//
//		Cell cell1 = row.createCell(0);
//		Cell cell2 = row.createCell(1);
//		Cell cell3 = row.createCell(2);

//		cell1.setCellValue("k");
//
//		cell2.setCellValue("kq");
//		cell3.setCellValue("keeee");

		for (int i = 0; i < 10; i++) {
			Row row = sheet.createRow(i);

			for (int k = 0; k < 10; k++) {

				Cell cell = row.createCell(k);
				cell.setCellValue((int) (Math.random() * 1000));

			}
		}
		File f1 = new File("C:\\Users\\karsh\\Desktop\\New folder\\write.xlsx");

		FileOutputStream fos = new FileOutputStream(f1);

		w1.write(fos);
		fos.close();

	}

}
