package KAUA_MATHEUS.segundo_bimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RequestMethods {
    
    String ra, desc, foto;

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String postStudent(){
        try{
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
    
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"imageUrl\": \"" + this.foto + "\",\r\n" + //
                                "  \"description\": \""+ this.desc + "\",\r\n" + //
                                "  \"ra\": \"" + this.ra + "\"\r\n" + //
                                "}";
    
            connection.setRequestMethod("POST");
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            try(OutputStream os = connection.getOutputStream()){
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
    
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
    
            while((line = reader.readLine()) != null){
                response.append(line);
            }
    
            reader.close();
            connection.disconnect();
    
            return response.toString();
    
            }catch(Exception e)
            {
                JFrame frame = new JFrame("ShowMessageDialog");
                JOptionPane.showMessageDialog(frame, "Deu erro" + e, null, JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
                return null;
            }
    }

    public String getStudents(){
        try{
            URL url = new URL("https://poo-exam.vercel.app/api/students");
    
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
    
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
    
            while((line = reader.readLine()) != null){
                response.append(line);
            }
    
            reader.close();
            connection.disconnect();
    
            return response.toString();
    
            }catch(Exception e)
            {
                JFrame frame = new JFrame("ShowMessageDialog");
                JOptionPane.showMessageDialog(frame, "Deu erro" + e, null, JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
                return null;
            }
    }

}
