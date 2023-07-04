package com.eduardo.app.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Property {
    private static final Logger LOG = Logger.getLogger(Property.class.getName());
    public static String file = "application.properties";
    private static Properties properties = new Properties();
    private static InputStream input;

    public static Object get(String name) {
        if (Objects.isNull(input)) {
            loadFile();
        }
        return properties.get(name);
    }


    private static void loadFile() {
        try {
            input = new FileInputStream(ClassLoader.getSystemClassLoader().getResource(file).getFile());
            properties.load(input);
        } catch (FileNotFoundException e) {
            LOG.log(Level.WARNING, e.getMessage());
        } catch (IOException e) {
            LOG.log(Level.WARNING, e.getMessage());
        }
    }

}
