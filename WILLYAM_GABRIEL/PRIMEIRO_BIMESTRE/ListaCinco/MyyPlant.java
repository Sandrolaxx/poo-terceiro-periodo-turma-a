package WILLYAM_GABRIEL.PRIMEIRO_BIMESTRE.ATIVIDADES.ListaCinco;
public class MyyPlant {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("CLEBER", 25, "MY PALNT'S", "CASCAVEL", "CASCAVEL VELHO", "RUA ROMA", 1200.0);
        Cliente cliente1 = new Cliente("DONA NEIDE", 64, "CASCAVEL", "PARQUE VERDE", "RUA IPÊ");

        Loja loja = new Loja("MY PLANT'S", "FLORICULTURA MY PLANT'S", "123456789", "CASCAVEL", "CENTRO", "AV. BRASIL");
        loja.adicionarVendedor(vendedor1);
        loja.adicionarCliente(cliente1);

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DA LOJA");
        loja.apresentarSe();
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DO VENDEDOR");
        vendedor1.apresentarSe();
        System.out.println("MÉDIA DO SEU SALÁRIO: " + vendedor1.calcularMedia());
        System.out.println("SEU BÔNUS: " + vendedor1.calcularBonus());
        System.out.println("================================================");

        System.out.println("================================================");
        System.out.println("INFORMAÇÕES DO CLIENTE");
        cliente1.apresentarSe();
        System.out.println("================================================");
    }
}