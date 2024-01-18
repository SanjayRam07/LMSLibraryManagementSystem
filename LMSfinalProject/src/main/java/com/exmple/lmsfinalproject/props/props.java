package com.exmple.lmsfinalproject.props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class props {

    public static Properties properties;
    public static String url, user, pwd;
    
    public static void loadProps() throws FileNotFoundException, IOException {
        properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        }
        
        url = properties.getProperty("jdbcUrl");
        user = properties.getProperty("user");
        pwd = properties.getProperty("pwd");
    }
}
