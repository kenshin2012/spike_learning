package learning.properties;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;


public class TestProperties {
    public static void main(String[] args){
        try {
            //ascii编码的文件，中文用utf-8转移字符表示。
            ResourceBundle p = new PropertyResourceBundle(TestProperties.class.getResourceAsStream("/asci.properties"));
            System.out.println(p.getString("tt"));
            //utf-8编码的文件，中文值乱码
            ResourceBundle p2 = new PropertyResourceBundle(TestProperties.class.getResourceAsStream("/test.properties"));
            System.out.println(p2.getString("y"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
