package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties(String path) {
        FileInputStream fileInputStream = null;
        Properties properties = null;
        try {
            fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException ioException) {
            System.out.println("Please check the file at the path if it is available " + path);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static String getProperty(String key)  {

        Properties properties = getProperties(Constant.CONFIG_READER_PATH);
        String value = properties.getProperty(key);
        return value;
    }
}
