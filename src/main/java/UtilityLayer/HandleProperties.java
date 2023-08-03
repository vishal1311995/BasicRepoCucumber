package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandleProperties {
		public static Properties props;
		public static Properties props() throws IOException {
		props = new Properties();
		String Path = "C:\\Users\\HP\\eclipse-workspace\\P1_Hybrid\\src\\main\\java\\ConfigLayer\\UserData.properties";
		FileInputStream fis = new FileInputStream(Path);
		props.load(fis);
		return props;
	}
}
