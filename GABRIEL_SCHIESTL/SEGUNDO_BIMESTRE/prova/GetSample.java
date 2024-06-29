package GABRIEL_SCHIESTL.SEGUNDO_BIMESTRE.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class GetSample {

    public void getStudents() {
        
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            JOptionPane.showMessageDialog(null, response,
                    "Listagem de alunos",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            throw new CustomException(e);
        }
    }
}
