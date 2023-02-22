package cf.wyderekk.config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class Config {

    public static JSONParser parser = new JSONParser();

    public static String getPath() {
        String configPath = "src/main/resources/config.json";
        try {
            Object obj = parser.parse(new FileReader(configPath));
            JSONObject jsonObject = (JSONObject) obj;
            return (String) jsonObject.get("path");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
