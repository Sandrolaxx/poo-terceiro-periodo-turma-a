package BIM1.Lista5Lojas;

import java.util.ArrayList;

public class Loja {
    private String nomeLoja;
            private String razaoSocial;
            private String cnpj;
            private Endereco endereco;
            private ArrayList <Integer> listaClientes = new ArrayList<>();
            private ArrayList <Integer> listaVendedores = new ArrayList<>();


            public Loja(String nomeLoja, String razaoSocial, String cnpj, Endereco endereco,
                    ArrayList<Integer> listaClientes, ArrayList<Integer> listaVendedores) {
                this.nomeLoja = nomeLoja;
                this.razaoSocial = razaoSocial;
                this.cnpj = cnpj;
                this.endereco = endereco;
                this.listaClientes = listaClientes;
                this.listaVendedores = listaVendedores;
            }


            public String getNomeLoja() {
                return nomeLoja;
            }


            public void setNomeLoja(String nomeLoja) {
                this.nomeLoja = nomeLoja;
            }


            public int contarClientes(){
                return this.listaClientes.size();
            }


            public int contarVendedores(){
                return this.listaVendedores.size();
            }


            public void apresentarse(){
                System.out.println("Loja " + nomeLoja + ", de cnpj: " + cnpj + ", localizada em " + endereco);
            }
}
