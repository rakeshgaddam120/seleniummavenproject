package day03;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class program01 {

	public static void main(String[] args) throws Exception {
		File src = new File(".\\src\\test\\resources\\datasheet.xlsx");
		FileInputStream stream = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sh = wb.getSheet("test");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getNumericCellValue());
		
		DataFormatter data = new DataFormatter();
		System.out.println(data.formatCellValue(sh.getRow(0).getCell(0)));
		System.out.println(data.formatCellValue(sh.getRow(1).getCell(0)));

	}

}