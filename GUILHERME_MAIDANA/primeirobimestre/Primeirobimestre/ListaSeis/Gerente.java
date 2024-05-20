package primeirobimestre.Primeirobimestre.ListaSeis;    public class Gerente {
        String nome;
        int idade;
        Loja loja;
        String cidade;
        String bairro;
        String rua;
        double salarioBase;
        double[] salarioRecebido;
        
        public Gerente(String nome, int idade, Loja loja, String cidade, String bairro, String rua, double salarioBase, double[] salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja; 
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.salarioBase = salarioBase;
            this.salarioRecebido = salarioRecebido != null ? salarioRecebido : new double[0];
        }
    
        
        public Gerente(String nome, int idade, Loja loja, Endereco endereco, double salarioBase, double[] salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja;
            this.cidade = endereco.getCidade();
            this.bairro = endereco.getBairro();
            this.rua = endereco.getRua();
            this.salarioBase = salarioBase;
            this.salarioRecebido = salarioRecebido != null ? salarioRecebido : new double[0];
        }
    
        public void apresentarSe() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            if (loja != null) {
                System.out.println("Loja: " + loja.getNome());
            } else {
                System.out.println("Loja: NÃ£o especificada");
            }
        }
    
        public double calcularMedia() {
            if (salarioRecebido != null && salarioRecebido.length > 0) {
                double soma = 0;
                for (double salario : salarioRecebido) {
                    soma += salario;
                }
                return soma / salarioRecebido.length;
            } else {
                return 0;
            }
        }
    
        public double calcularBonus() {
            return salarioBase * 0.35;
        }
    }