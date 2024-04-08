package PRIMEIRO_BIMESTRE.lists.Lista5;

public class MyyPlant {
    public static void main(String[] args) {
        Vendedor igor = new Vendedor();
        igor.name = "Igor";
        igor.age = 15;
        Loja matriz = new Loja();
        matriz.popularName = "MyyPlant";
        matriz.socialReason = "MyyPlant plantas S.A.";
        matriz.cnpj = "11.111.111/0001-11";
        matriz.city = "Cascavel";
        matriz.street = "Avenida das Torres";
        matriz.block = "FAG";
        matriz.sellers[0] = "Igor";
        matriz.customers[0] = "Ingrid";
        igor.store = matriz;
        igor.presentation();
    }
}
