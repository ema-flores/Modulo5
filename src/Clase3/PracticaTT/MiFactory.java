package Clase3.PracticaTT;

import java.io.FileReader;
import java.util.*;

public class MiFactory {

    private static final String PROPERTIES_FILE_NAME = "MiFactory.properties";
    private static final String SORTER_PROPERTY_NAME = "sorter";

    public static Object getInstance(String objName) {
        FileReader filereader = null;
        try {
            filereader = new FileReader(PROPERTIES_FILE_NAME);
            Properties properties = new Properties();
            properties.load(filereader);
            filereader.close();
            String sorterName = findPropertyValueByObjectName(properties, objName);
            return Class.forName(sorterName).getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Hubo un error al instanciar el objeto: " + objName);
        }
    }

    private static String findPropertyValueByObjectName(Properties properties, String objName) {
        String sorterValue = properties.getProperty(SORTER_PROPERTY_NAME);
        List<String> sorters = Arrays.asList(sorterValue.split(","));
        for (String sorter : sorters) {
            if (sorter.contains(objName)) {
                return sorter;
            }
        }
        return null;
    }
}
