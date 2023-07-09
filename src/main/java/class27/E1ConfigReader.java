package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
String path = "C:\\Users\\Denys\\IdeaProjects\\SDETJavaBatch16\\Files\\Config.properties";

        String path1=System.getProperty("user.dir")+"\\Files\\Config.properties";
        // System.out.println(System.getProperty("user.dir"));
        FileInputStream fileInputStream = new FileInputStream(path1);
        Properties prop = new Properties();
        prop.load(fileInputStream);
        System.out.println(prop.getProperty("userName"));
    }
}
