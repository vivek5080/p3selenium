package com.p3selenium.data;

/**
 * @author ABHISHEK
 *
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

	static String var = null;

	public static String getVar(String key) {
		Properties props = new Properties();
		String path = System.getProperty("user.dir");
		try {
			// load a properties file
			path = path + "\\src\\test\\resources\\";
			props.load(new FileInputStream(path + "data.properties"));
			if (key != null) {
				var = props.getProperty(key);
			}
			else
			{
				System.out.println("Got null value in key, you may provide a null valie while calling getVar(String key)");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return var;
	}

}
