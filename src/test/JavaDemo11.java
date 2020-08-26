package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaDemo11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\EclipseProjects\\workspace\\DemoT_Java\\src\\fileResources\\myProp.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Key1"));
		System.out.println(prop.getProperty("Key2"));
		System.out.println(prop.getProperty("Key3"));
		System.out.println(prop.getProperty("Key4"));
		System.out.println(prop.getProperty("Key5"));

	}

}
