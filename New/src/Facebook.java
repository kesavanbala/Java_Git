import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Facebook {
	@Test
	public void Open() throws IOException {
		
			//new code after k7 and need this for compare
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kesavan B\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(5000);
			WebDriverWait ww=new WebDriverWait(driver,20);
			WebElement e1=driver.findElement(By.xpath("//label[@for='onward_cal']"));
			ww.until(ExpectedConditions.elementToBeClickable(e1));
			e1.click();
			List<WebElement> e=driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr"));
			int len=e.size();
			System.out.println(len);
			//String st=driver.findElement(By.xpath("(//div[@class='rb-calendar']/table/tbody/tr)[3]/td[2]")).getText();
			//System.out.println(st);
			
			
			
			
			for(int i=3;i<=len;i++)
			{
				for(int j=1;j<=7;j++)
				{
					String st=driver.findElement(By.xpath("(//div[@class='rb-calendar']/table/tbody/tr)[i]/td[j]")).getText();
					System.out.println(st);
					if(st.equals("26"))
					{
						driver.findElement(By.xpath("(//div[@class='rb-calendar']/table/tbody/tr)[i]/td[j]")).click();
						break;
					}
					
				}
			}
			
			//(//div[@class="rb-calendar"]/table/tbody/tr)[3]/td[1]
			//(//div[@class="rb-calendar"]/table/tbody/tr)[6]/td[1]
			//(//div[@class="rb-calendar"]/table/tbody/tr)[8]/td[7]
			
			
			
			
			/*
			File f=new File("C:\\Users\\Kesavan B\\Desktop\\XLDocument.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			int i=sheet.getLastRowNum();
			int j=sheet.getRow(0).getLastCellNum();  */


	}

}
