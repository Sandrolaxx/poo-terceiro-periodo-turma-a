package ProvaPoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    private static final String BASE_API_URL = "https://poo-exam.vercel.app/api";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createTestimonial();
                    break;
                case 3:
                    System.out.println("Saindo da aplicação...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Listagem dos alunos");
        System.out.println("2. Criar registro de testemunho");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void listStudents() {
        try {
            URL url = new URL(BASE_API_URL + "/students");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            if (status != 200) {
                showErrorModal("Erro ao buscar a lista de alunos: " + con.getResponseMessage());
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            String responseBody = content.toString();
            parseAndPrintStudents(responseBody);
        } catch (IOException e) {
            showErrorModal("Erro de comunicação: " + e.getMessage());
        }
    }

    private static void parseAndPrintStudents(String responseBody) {
        System.out.println("\n--- Lista de Alunos ---");
        responseBody = responseBody.substring(1, responseBody.length() - 1); // remove [ e ]
        String[] students = responseBody.split("\\},\\{");

        for (String student : students) {
            student = student.replace("{", "").replace("}", "").replace("\"", "");
            String[] fields = student.split(",");
            String ra = "", name = "";
            for (String field : fields) {
                String[] keyValue = field.split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                if (key.equals("ra")) {
                    ra = value;
                } else if (key.equals("name")) {
                    name = value;
                }
            }
            System.out.println("RA: " + ra + ", Nome: " + name);
        }
    }

    private static void createTestimonial() {
        try {
            System.out.print("Informe a URL da foto: ");
            String photoUrl = scanner.nextLine();
            System.out.print("Informe o RA do aluno: ");
            String ra = scanner.nextLine();
            System.out.print("Informe o texto do testemunho: ");
            String text = scanner.nextLine();

            String testimonial = String.format("{\"photo\":\"%s\",\"ra\":\"%s\",\"text\":\"%s\"}", photoUrl, ra, text);

            URL url = new URL(BASE_API_URL + "/testimonial");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setDoOutput(true);

            OutputStream os = con.getOutputStream();
            os.write(testimonial.getBytes("utf-8"));
            os.close();

            int status = con.getResponseCode();
            if (status != 201) {
                showErrorModal("Erro ao criar testemunho: " + con.getResponseMessage());
                return;
            }

            System.out.println("Testemunho criado com sucesso!");
        } catch (IOException e) {
            showErrorModal("Erro de comunicação: " + e.getMessage());
        }
    }

    private static void showErrorModal(String errorMessage) {
        System.out.println("\n--- Erro ---");
        System.out.println(errorMessage);
        System.out.println("------------\n");
    }
}
