package excel_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Read_Test_Data {

	public static HashMap<String,String> getTestData(String TC_ID) throws IOException{
		File file = new File("C:\\Users\\HP\\Desktop\\TestData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fileInputStream);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getLastRowNum() - sh.getFirstRowNum();
        Row headerrow = sh.getRow(0);
        HashMap<String, String> map = new HashMap<String, String>();

        for (int row = 1; row < totalNoOfRows; row++) {

            Row row1 = sh.getRow(row);
            if ((row1.getCell(0).getStringCellValue()).equals(TC_ID)) {
                for (int col = 1; col < row1.getLastCellNum(); col++) {
                    map.put(headerrow.getCell(col).getStringCellValue(), row1.getCell(col).getStringCellValue());
                }
              //  System.out.println(map);

            }
           
}
        
	
        return map;

}
	/*@DataProvider(name="searchCategory")
	public static Object[][] searchcategoryDataProvider() throws IOException{
		 return new Object[][]{
		//Object[][] m = new Object[2][2] ;
			  {getTestData("TC_001"),getTestData("TC_001")}
		//m[0][1]=K;
		
	
		 };
		
	}*/
	
}


