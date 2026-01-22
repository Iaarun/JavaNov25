package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class HandlePropertiesFile {
    String filePath = "src/filehandling/dummy.properties";
    public static void main(String[] args) {
        HandlePropertiesFile obj = new HandlePropertiesFile();
        obj.readPropertiesFileExample();

    }
    
    public void readPropertiesFileExample(){
        File file = new File(filePath);
        FileInputStream fis;
        //use Properties class to read properties file
        Properties properties = null;
        try{
            fis = new FileInputStream(file); // input stream to read the file
            properties = new Properties();
            properties.load(fis);
            
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));     
    }

    public void fileClassExample(){
       
        File file = new File(filePath);

        System.out.println( file.isFile());
        System.out.println( file.isDirectory());
        System.out.println( file.exists());
        System.out.println( file.getAbsolutePath());
        System.out.println( file.getName());
        System.out.println(file.lastModified());

    }
}
