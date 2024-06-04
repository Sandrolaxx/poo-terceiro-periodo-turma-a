// package primeirobi.listas.myyplant;
// import java.util.Date;
// import java.lang.String;

// public class MyyPlant {
//         public static void main(String[] args) {

//                 // Cliente

//         Cliente clienteUm = new Cliente(null, null, null, null, null, null, null, null);
//         Cliente clienteDois = new Cliente(null, null, null, null, null, null, null, null);
        
//         clienteUm.setNomeUsuario("Charles");
//         clienteUm.setIdadeUsuario(22);
//         clienteUm.setEstado("Rio de Janeiro");
//         clienteUm.setCidade("Copacabana");
//         clienteUm.setBairro("Tropicale");
//         clienteUm.setRua("Josué");
//         clienteUm.setNumero(15);
//         clienteUm.setComplemento("Casa");
        
//         clienteDois.setNomeUsuario("Jennie");
//         clienteDois.setIdadeUsuario(24);
//         clienteDois.setEstado("Kaurent");
//         clienteDois.setCidade("Southent");
//         clienteDois.setBairro("Hennit");
//         clienteDois.setRua("LLamour");
//         clienteDois.setNumero(7);
//         clienteDois.setComplemento("Apartamento");
        
//         String[] quantidadeClientes = new String[2];
//         quantidadeClientes[0] =  clienteUm.nomeUsuario;
//         quantidadeClientes[1] = clienteDois.nomeUsuario;
        
//         clienteUm.apresentarCliente();
//         clienteDois.apresentarCliente();
        
//         clienteUm.apresentarEndereco();
//         clienteDois.apresentarEndereco();

//                 // Vendedor

//         Vendedor vendedorUm = new Vendedor(null, null, null, null, null, null, null, null, null, null, null);
//         Vendedor vendedorDois = new Vendedor(null, null, null, null, null, null, null, null, null, null, null);

//         vendedorUm.setNomeFuncionario("Paola");
//         vendedorUm.setIdadeFuncionario(33);
//         vendedorUm.setCidade("Suntown");
//         vendedorUm.setBairro("Lalaland");
//         vendedorUm.setRua("Saint");

//         vendedorDois.setNomeFuncionario("Alec");
//         vendedorDois.setIdadeFuncionario(40);
//         vendedorDois.setCidade("Mountaine");
//         vendedorDois.setBairro("Rivertown");
//         vendedorDois.setRua("Pier");

//         String[] quantidadeVendedores = new String[2];
//         quantidadeVendedores[0] = vendedorUm.getNomeFuncionario();
//         quantidadeVendedores[1] = vendedorDois.getNomeFuncionario();

//         vendedorUm.calcularMedia();
//         vendedorUm.calcularBonus();

//                 // Gerente

//         Gerente gerenteUm = new Gerente(null, null, null, null, null, null, null, null, null, null, null);
//         Gerente gerenteDois = new Gerente(null, null, null, null, null, null, null, null, null, null, null);

//         gerenteUm.setNomeGerente("Chaewon");
//         gerenteUm.setIdade(23);
//         gerenteUm.setNomeFantasia("EASY Coffee");
//         gerenteUm.setCidade("Black Swane");
//         gerenteUm.setBairro("Smarter Area");
//         gerenteUm.setRua("Good Bones");

//         gerenteDois.setNomeGerente("Carpenter");
//         gerenteDois.setIdade(20);
//         gerenteDois.setNomeFantasia("X Espresso");
//         gerenteDois.setCidade("Fruit Cako");
//         gerenteDois.setBairro("Eletronic Mailen");
//         gerenteDois.setRua("Red Feather");

//                 // Loja

//         Loja lojaUm = new Loja(null, null, null, null, 
//         null, null, null, null, null, null, null);

//         lojaUm.setNomeFantasia("MyyPlant");
//         lojaUm.setRazaoSocial("Estabelecimentos de Venda de Plantas Exóticas Gabriela");
//         lojaUm.setCnpj("777777777777");
//         lojaUm.setCidade("Java Ville");
//         lojaUm.setBairro("Coffeel");
//         lojaUm.setRua("Bean1");

//         lojaUm.quantidadeClientesInt = 2;
//         lojaUm.quantidadeVendedoresInt = 2;

//         lojaUm.apresentarLoja();
//         lojaUm.contarClientes();
//         lojaUm.contarVendedores();

//                 // Date

//         Date date = new Date();
//         long umDia = 86400000l;
//         long msDaquiCincoDias = date.getTime() + (5 * umDia);
//         Date dataDaquiCincoDias = new Date(msDaquiCincoDias);

//         //Item

//         //Pedido



        
//         }
// }
