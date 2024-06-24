package segundobi.aulas.aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import segundobi.aulas.aula7.Exemplohttp;

public class RegexSample {

    public class JsonUtils {

        public static Map<String, Object> srtToMap(String strJson) {
            // Extrair os dados do JSON usando expressões regulares
            Pattern pattern = Pattern.compile("\"(\\w+)\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)");
            Matcher matcher = pattern.matcher(strJson);
    
            // Mapa que irá armazenar a chave:valor do json
            Map<String, Object> jsonData = new HashMap<>();
    
            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
    
                jsonData.put(key, value.replace("\"", ""));
            }
    
            return jsonData;
        }

    }
    
}