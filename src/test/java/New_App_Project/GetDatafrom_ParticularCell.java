package New_App_Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDatafrom_ParticularCell {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fs);
		XSSFSheet sh = wo.getSheet("testdata");
		String data = sh.getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
		
		

	}

}
