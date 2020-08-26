package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JavaDemo12 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html
		//E:\EclipseProjects\workspace\DemoT_Java\src\fileResources\DemoTestData.xlsx

		System.out.println("Started");
		FileInputStream fis = new FileInputStream(new File("E:\\EclipseProjects\\workspace\\DemoT_Java\\src\\fileResources\\DemoTestData.xlsx"));

		//WorkBook/Sheet/Row/Cell - Interface

		Workbook wb = WorkbookFactory.create(fis);// extension - .xlsx / .xls

		System.out.println("Sheet name of 0th index :"+wb.getSheetName(0));

		System.out.println("Number of sheet:: "+wb.getNumberOfSheets());

		//Sheet st = wb.getSheet("DataSheet");
		Sheet st = wb.getSheetAt(1);

		System.out.println("FirstRowNumber"+st.getFirstRowNum() +" Last Row Number :: "+st.getLastRowNum());

		Row row0 = st.getRow(1);
		
		Cell cell00 = row0.getCell(0);

		String cellValue = cell00.getStringCellValue();

		System.out.println("cellValue :: "+cellValue);

		System.out.println("Ended");
	}
}
