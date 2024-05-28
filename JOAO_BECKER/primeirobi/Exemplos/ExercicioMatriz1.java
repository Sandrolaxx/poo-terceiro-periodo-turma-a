package primeirobi.Exemplos;

public class ExercicioMatriz1 {
    public static void main(String[] args){
        int[][] matriz1 =new int[][]{{31,27,4},{44,32,95},{9,16,56}};
        int[][] matriz2 =new int[][]{{10,88,12},{38,32,73},{14,21,82}};

        for(int linha=0;linha<matriz1.length;linha++){
            System.out.println("");
            for(int coluna=0;coluna<matriz1.length;coluna++){
                System.out.print(" "+matriz1[linha][coluna]);
            }
        }
        System.out.println("");
        for(int linha=0;linha<matriz2.length;linha++){
            System.out.println("");
            for(int coluna=0;coluna<matriz2.length;coluna++){
                System.out.print(" "+matriz2[linha][coluna]);
            }

        }
        int mes=5;
        if ((mes %2) != 0){
            System.out.println("o mês tem 31 dias");
        }else{
            if(mes==2){
                System.out.println("o mês tem 28 dias");
            }else{
                System.out.println("O mês tem 30 dias");
            }
        }
    }
}
