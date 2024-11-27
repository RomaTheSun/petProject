package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    static Properties properties = new Properties();

    public static String getProperty(String key) {
        String filename = "property.config";
        try (InputStream input = PropertyReader.class.getClassLoader().getResourceAsStream(filename)) {
            if (input == null) {
                throw new RuntimeException("Property file '" + filename + "' not found in the classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error reading property file", e);
        }
        return properties.getProperty(key);
    }
}
