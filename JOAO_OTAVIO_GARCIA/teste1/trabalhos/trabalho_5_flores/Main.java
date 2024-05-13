package trabalho_5_flores;

public class Main {

    public static void main(String[] args) {

        //loja
        Loja Loja_principal = new Loja("My Plant", "My plant Gabriela LTD", "Pato branco", "Centro", "10071048000144", "Cascavel");
        //Clientes
        Cliente Clientes_1 = new Cliente(21, "Sandro", "Cascavel", "Pelicano", "3 de Março");
        Cliente Clientes_2 = new Cliente(21, "Sandra", "Cascavel", "Pelicano", "5 de Março");

        //vendedor
        Vendendor Vendedor_1 = new Vendendor("joao", 19, "Tupãssi", "Pombo", "Janeiro", 
        1800f, "loja Matriz(my plant)",1500,new Float[]{800f,1555f,2000f});
        Vendendor Vendedor_2 = new Vendendor("Clarencio", 22, "Toledo", "Canarinho", "Ovo",
         1200f, "loha Matriz(my plant)", 1200,new Float[]{1500f,1800f,1458f});

       
        Cliente[] Cliente = new Cliente[]{Clientes_1,Clientes_2};
        Vendendor[] Vendedores = new Vendendor[]{Vendedor_1,Vendedor_2};

        Loja_principal.Clientes = Cliente;
        Loja_principal.Vendedores = Vendedores;

        Vendedor_1.apresentarSe();
        Vendedor_2.apresentarSe();
        Clientes_1.apresentarSe();
        Clientes_2.apresentarSe();
        Loja_principal.apresentarSe();
    }
    
}
