import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Facebook {
	@Test
	public void Open() throws IOException {
		
			//new code after k7 and need this for compare
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kesavan B\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.com/");
			
			File f=new File("C:\\Users\\Kesavan B\\Desktop\\XLDocument.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			int i=sheet.getLastRowNum();
			int j=sheet.getRow(0).getLastCellNum();


	}

}
