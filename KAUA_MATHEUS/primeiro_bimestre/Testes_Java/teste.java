package KAUA_MATHEUS.primeiro_bimestre;

public class teste {
    public static void main(String[] args) {

        funcionario funcionario_1 = new funcionario();

        funcionario_1.setNome("Kauã");
        funcionario_1.nome = "João";

        //cliente cliente_1 = new cliente();
        //cliente_1.apresentarse();

        funcionario_1.apresentarse();



    }

    public static interface pessoa {

        void apresentarse();
        float getbonificacao();
    }
    
    public static class funcionario implements pessoa{

        private String nome;

        public void setNome(String nome) {
            this.nome = nome;
        }
        
        @Override
        public void apresentarse() {
            System.out.printf("Olá, meu nome é %s!\n", this.nome);
        }

        @Override
        public float getbonificacao() {
            return 300 * 4;
        }

    }
    
    public static class cliente implements pessoa {

        @Override
        public void apresentarse() {
            System.out.println("Olá, sou um cliente");
        }
    }

    

}




