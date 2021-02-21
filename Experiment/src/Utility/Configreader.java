package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader 

{Properties pro;
	public Configreader()
	{
		
		
		
		try {
			File src = new File("./Cong/configure.property");
			FileInputStream fis = new FileInputStream(src);
			 pro = new Properties();
			
			pro.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		
		
	}
	
	public String getchromepath()
	
	{
		
		String path=pro.getProperty("chromedriver");
		return path;
		
	}
	
public String geturl()
	
	{
		
		String path=pro.getProperty("URL");
		return path;
		
	}
	
	

}
