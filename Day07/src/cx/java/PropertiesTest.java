package cx.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @Author cx
 * @Date 2023/02/07/22:31
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        properties.load(fileInputStream);

        String name = properties.getProperty("name");
        String password = properties.getProperty("password");

        System.out.println("name = " + name + " , password = " + password);
    }

}
