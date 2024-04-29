package primeirobimestre.Listasete;
    public class Item {
        int id;
        String nome;
        String tipo;
        double valor;
    
        public Item(int id, String nome, String tipo, double valor) {
            this.id = id;
            this.nome = nome;
            this.tipo = tipo;
            this.valor = valor;
        }
    
        public void gerarDescricao() {
            System.out.println("ID: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Tipo: " + tipo);
            System.out.println("Valor: " + valor);
        }
    
        public void apresentarSe() {
            System.out.println("Nome: " + nome);
            System.out.println("Valor: " + valor);
        }
    
        public double getValor() {
            
            throw new UnsupportedOperationException("Unimplemented method 'getValor'");
        }
    }