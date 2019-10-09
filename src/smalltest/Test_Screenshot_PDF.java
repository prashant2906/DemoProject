package smalltest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class Test_Screenshot_PDF {
	
		public WebDriver driver;
		ArrayList<byte[]> screenshot=new ArrayList<byte[]>();;
//		byte[] src;
		@Test
		public void SanityFlow() throws WebDriverException, IOException
		{
			 driver = new FirefoxDriver();
			 screenshot.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			 driver.manage().window().maximize();
			 screenshot.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			 driver.get("https://www.amazon.in/");
			 screenshot.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
//			 for (int i=0;i<screenshot.size();i++){
//				 System.out.println(screenshot.get(i));
//			 }
		}
		
		@Test
		public void PDF(ArrayList<byte[]> screenshot) throws IOException, DocumentException		{
//			byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//FileUtils.copyFile(src, new File("C:\\Users\\PrashantGoel\\Desktop\\Test.png"));
			
			Document document = new Document();
			FileOutputStream fos = new FileOutputStream("C:\\Users\\PrashantGoel\\Desktop\\my_web.pdf");
			PdfWriter.getInstance(document, fos);
			document.open();
		
			//String filename = "C:\\Users\\PrashantGoel\\Desktop\\Test.png";
			
			
			for (byte[] bytes : screenshot )
			{
		    Image image = Image.getInstance(bytes);
		    image.scaleToFit(PageSize.A4);
			document.add(image);
			document.add(new Paragraph(" "));
			}
			document.close();
		}

	}
