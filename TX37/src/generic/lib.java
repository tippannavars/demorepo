package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class lib implements Iautoconstants
{
	public static String getproperty(String path,String key)
	{
		String value="";
		Properties p=new Properties();
		try {
			p.load(new FileInputStream(path));
			value=p.getProperty(key);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}

}
