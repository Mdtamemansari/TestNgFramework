package New_App_Project;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write;

public class insertDataIntoExcelSheet {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wo = new XSSFWorkbook();
		XSSFSheet sh = wo.createSheet("testdata");
		
		XSSFRow rw = sh.createRow(0);
				rw.createCell(0).setCellValue("User_Name");
				rw.createCell(1).setCellValue("Password");
		 
		XSSFRow rw1 = sh.createRow(1);
				rw1.createCell(0).setCellValue("Ansari");
				rw1.createCell(1).setCellValue("admin@123");
				
		XSSFRow rw2 = sh.createRow(2);
				rw2.createCell(0).setCellValue("admin");
				rw2.createCell(1).setCellValue("admin321");
				
		XSSFRow rw3 = sh.createRow(3);
				rw3.createCell(0).setCellValue("ayan");
				rw3.createCell(1).setCellValue("mmdd123");
				
		XSSFRow rw4 = sh.createRow(4);
				rw4.createCell(0).setCellValue("admin@yourstore.com");
				rw4.createCell(1).setCellValue("admin");
				
		FileOutputStream fp = new FileOutputStream("F:\\SW Testing videos\\TEST_NG\\Test_data_Records.xlsx");
		wo.write(fp);

	}

}
