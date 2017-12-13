package co.uk.rsheyeah.qa.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * This class is used for reading the properties file used to set up the browsers,
 * and other properties required by tests.
 */
public class ReadPropertiesFile {

	private static final Logger logger = LoggerFactory.getLogger(ReadPropertiesFile.class);

	public static Map<String, Object> readFile(String name) {
		Map<String, Object> map = null;
		try {
			String fileName = ClassLoader.getSystemResource(name).toURI().getPath();
			File file = new File(fileName);
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration enuKeys = properties.keys();
			map = new HashMap<>();
			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				map.put(key, value);
			}
		} catch (FileNotFoundException e) {
			logger.error("Encountered exception while reading file : ", e);
		} catch (IOException e) {
			logger.error("Encountered exception while reading file : ", e);
		} catch (URISyntaxException e) {
			logger.error("Encountered exception while reading file : ", e);
		}
		return map;
	}
}
