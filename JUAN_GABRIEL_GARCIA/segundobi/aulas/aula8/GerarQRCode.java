// package segundobi.aulas.aula8;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.MalformedURLException;
// import java.net.URL;
// import java.text.NumberFormat;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// import javax.swing.JFrame;
// import javax.swing.JOptionPane;

// public class GerarQRCode {
    
//     // public static void main(String[] args) {
        
//     //     // try {
//     //     //     URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD");

//     //     //     HttpURLConnection connection = (HttpURLConnection) url.openConnection();

//     //     //     connection.setRequestMethod("GET");

//     //     //     BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//     //     //     StringBuilder response = new StringBuilder();
//     //     //     String line;

//     //     //     while ((line = reader.readLine()) != null) {
//     //     //         response.append(line);
//     //     //     }

//     //     //     reader.close();

//     //     //     connection.disconnect();

//     //     //     JOptionPane.showMessageDialog(null,
//     //     //     response,
//     //     //     "CotaçãoUSD/Reais",
//     //     //     0);

//     //     // } catch (Exception e) {
//     //     //     e.printStackTrace();
//     //     // }
//     // }
    
//      public static void main(String[] args) {
//         String jsonResponse = TesteHttp.getJsonData();

//         try {
//             // Extrair os dados do JSON usando expressões regulares
//             Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
//             Matcher matcher = pattern.matcher(jsonResponse);

//             // Mapa que irá armazenar a chave:valor do json
//             Map<String, Object> jsonData = new HashMap<>();

//             while (matcher.find()) {
//                 String key = matcher.group(1);
//                 String value = matcher.group(2);

//                 jsonData.put(key, value);
//             }

//             // Exibindo os dados da moeda
//             StringBuilder sb = new StringBuilder();
//             //Formatar moeda
//             NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
//             Double amount = Double.parseDouble(jsonData.get("bid").toString());

//             sb.append("Dados da moeda:");
//             sb.append("\nCódigo: " + jsonData.get("code"));
//             sb.append("\nNome: " + jsonData.get("name"));
//             sb.append("\nValor: " + currencyFormat.format(amount));

//             JFrame frame = new JFrame("Cotação atual USD");
//             JOptionPane.showMessageDialog(frame, sb.toString(), "Cotação atual USD", JOptionPane.INFORMATION_MESSAGE);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
