package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class bhimatests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Bhimaa");
		//String path="D:\\data.xlsx";
		
		//Map<Integer,Map<String,String>> dataMap=getdata(path,String sheet1);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhema\\eclipse-workspace\\testproject\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		

	}
/*public static Map<Integer,Map<String,String>> getdata(String path,String sheetname) throws IOException{
	Map<Integer,Map<String,String>> data=new LinkedHashMap<Integer,Map<String,String>>();
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet(sheetname);
	DataFormatter df=new DataFormatter();
	Iterator<Row> rows=sheet.iterator();
	int rowNo=0;
	while(rows.hasNext()) {
		Row row=rows.next();
		Iterator<Cell> cells = row.iterator();
		if(rowNo!=0) {
			Map<String,String> eachRowData = new LinkedHashMap<String,String>();
			int cellNo=0;
			while(cells.hasNext()) {
				Cell cell = cells.next();
				String cellvalue=df.formatCellValue(cell);
				
				Row headerRow = sheet.getRow(0);
			    
		
			    if (cellvalue.isEmpty()) {
			        eachRowData.put(df.formatCellValue(headerRow.getCell(cellNo)), ""); // Insert empty string
			    } else {
			        eachRowData.put(df.formatCellValue(headerRow.getCell(cellNo)), cellvalue);
			    }
			    cellNo++;
			}
			data.put(rowNo, eachRowData);
			
		}
		rowNo++;
		
		
	}
	workbook.close();
	fis.close();
	return data;
	
	
}*/
	
}
