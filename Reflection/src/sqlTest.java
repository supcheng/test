import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class sqlTest {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
//        InputStream inputStream=new FileInputStream("E:\\java\\demo1\\Reflection\\config.properties");
//        properties.load(inputStream);
        properties.load(sqlTest.class.getClassLoader().getResourceAsStream("config.properties"));
        properties.setProperty("c","d");
        String target =  properties.getProperty("target");
        Source source = (Source) Class.forName(target).newInstance();
        source.Select();


    }
}
