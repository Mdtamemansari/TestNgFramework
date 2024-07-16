package New_App_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Modify_ParticularCell_Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream fp = new FileInputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		XSSFWorkbook wo = new XSSFWorkbook(fp);
		XSSFSheet sh = wo.getSheet("testdata");
		sh.getRow(1).getCell(0).setCellValue("Swathi");
		FileOutputStream fo = new FileOutputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		wo.write(fo);
	}

}
