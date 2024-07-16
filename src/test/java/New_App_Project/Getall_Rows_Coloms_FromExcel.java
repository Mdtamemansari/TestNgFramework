package New_App_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getall_Rows_Coloms_FromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fp = new FileInputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fp);
		XSSFSheet sh = wo.getSheet("testdata");
		int	rowcount = sh.getLastRowNum();
//		System.out.println("Number of rows in excel is:" +rowcount);
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow r = sh.getRow(i);
			int cellcount =  r.getLastCellNum();
//			System.out.println("Total num of cells in a row: "+i+ " is: "+cellcount);
			for (int j = 0; j < cellcount; j++) {
				System.out.print(r.getCell(j).getStringCellValue()+ "  ");
			}
			System.out.println();
		}

	}

}
