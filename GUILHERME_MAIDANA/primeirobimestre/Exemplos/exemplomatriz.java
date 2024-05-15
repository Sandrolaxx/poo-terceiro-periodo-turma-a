package primeirobimestre.Exemplos;

public class exemplomatriz {

    public static void main(String[] args) {
    
        int[][] matrizum = new int[][] { {31, 27, 4}, {44, 32, 95}, {9, 16, 56} };
        int[][] matrizdois = new int[][] { {10, 88, 12}, {38, 32, 73}, {14, 21, 52} };
        int[][] matriztres = new int[3][3];
        int[][] matrizquatro= new int[3][3];
        
        System.out.println(matrizum[1][2] + " " + matrizdois[2][0]);


        for (int i=0; i<3; i++) {
            for (int j=0; j<3;j++ ) {

                matriztres[i][j]= matrizum[i][j]+matrizdois[i][j];
            }
        }
            
        //Imprimindo a Matriz tres com os valores somados
        System.out.print("A soma das matrizes é: \n");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf(matriztres[i][j] + " ");
                }
                
            System.out.println();
           }

           
        // Multiplando a Matrizdois por 4 
        System.out.print("A multiplicação da matriz é: \n");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3;j++ ) {

                matrizquatro[i][j] = matrizdois[i][j] * 4;
            }
        }

        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf(matrizquatro[i][j] + " ");
                }
                
            System.out.println();
           }



       }
   }
            
