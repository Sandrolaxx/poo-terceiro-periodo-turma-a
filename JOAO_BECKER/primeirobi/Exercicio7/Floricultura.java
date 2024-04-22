package primeirobi.Exercicio7;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Floricultura {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Boolean menu = true;
        while(menu==true){
            System.out.println("[1] - Gerar pedido \n[2] - Registro De Vendas\n[3] - Cadastro de itens\n[4] - Listar itens\n[5] - Sair ");
            short menuOpcao;
            menuOpcao=leitor.nextShort();
            switch (menuOpcao) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
     }

}
/*Realizar melhorias de encapsulamento.

2. Implementar/Melhorar ProcessaPedido, possibilitar a venda com item definido pelo cliente.

3. Refatorar Menu existente. Adicione ao menu existente as seguintes opções:
- Cadastro de itens - Realiza o cadastro de um novo item.
- Listar itens - Apenas lista os itens já cadastrados, min 2 itens.

4. Cliente deverá selecionar o item que deseja compra, com isso criar o pedido.
 */
