import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {
        

        final String secret_token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJVODBQWmRBWjVuVk9qSVVEQ0tmZmU5bFJkNW1TbU15aDR3d2NQRlBySWpsekQweE9XQ3c3cTdLMjMvQXAzdlR0NTY1Z0dUem4zckNkUUdtaFdEZXJFS1BYODQ1bVFGZGpXY05vZDlpbEhKdDVTWTh5b0VpMzdvMnFjVDdBYm5NL2swYU5LV2xsT3F4U2h6eE8zb0J5NWZ2UlhHZTN0TENyUGxjb2h5Ynp5cVhXQW15Z3ltRzcyUUkzcllPNlNFckQvUzEwa2pzZ2J6NEpRUDMxcWhPODkrYWh5RS9walA0bkJPY0FoWVFWRVUvVVhLbUE0KzhDK25vbWQxRUNDekNZR0swYzFRNDZ2MDFURUN0ajFlNFVVaDFORndRSnk3cm5iUXI4ZW1tNFh2ci9QYzZVd2piNG8xME5wdU42bUhlNWNIRGRXNlhMUTgwYUhMaEVkaFRqdGV1VWtZeVV1cmtJbkZTMFRxZkdVN2ZlbFh6VkwzYnlwenpJNEJFazBHTEFsT1pXZnU3dWxna3hWWElBcEZITjhqREsxb1dZM24rY3hTVlRraFVHL0phSk5sSjVlS2ppdWtRZ2d0bWxXcGJsVW00b01QNnVUNkNUWFozdmxuRDQySEJ5Y3NCaGM1MmFNMzlveWl0MGI0WC9pazFlTUhlbzJnVG1qeXpXVnBHTHZUeDF0UVY4MXBkaEVRc0VuRE1vNDVvdUZQRlJSRkhvN1hZNW55cllhZlVoSE41ckhyMlJsZlUrWlkwTEhYT3FLMnZDZ2VBUXNHaUNRd3FpdTBabWpRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiM2JmYmFiYjYwNzI5NDU4OGIxMDQiLCJleHAiOjE3MTg5MDY0MzYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.9f7nQm0lj5xCGcRqHciU1SW25BiE6XvTUeDb9zEoG8g"; 
        String[] opcao = { "Listar convênios de pagamento", "Consulta de boleto"};

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma opção:",
                "Escolha",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcao,
                opcao[0]);

        switch (escolha) {
            case 0:
            Get.getJsonData(secret_token);    
                break;
            case 1:
            Post.PostATV(secret_token);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma das Alternativas foi Escolhida!!!");
                break;
        }
        
    }
}