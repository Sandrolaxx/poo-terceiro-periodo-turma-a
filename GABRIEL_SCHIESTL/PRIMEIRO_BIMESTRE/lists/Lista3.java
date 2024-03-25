package PRIMEIRO_BIMESTRE.lists;

import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
        int line = 0;
        int controller = 0;
        double finalDiscount = 0;
        Scanner sc = new Scanner(System.in);
        int storage = getStorage(sc);
        float[][] dayAndMonth = new float[12][30];
        int[] differentPlantsRegister = new int[100];
        float[] priceRegister = new float[100];
        double[] discountRegister = new double[100];
        float[] qttTotaleRegister = new float[100];
        String[] plants = new String[storage];
        float[] price = new float[storage];
        initializeArrays(sc, storage, plants, price);

        int choosenOption = 0;
        while (choosenOption != 6) {
            choosenOption = showOptions(sc, choosenOption);
            switch (choosenOption) {
                case 1:
                    line = calculateTotalPrice(sc, line, differentPlantsRegister, priceRegister, discountRegister,
                            qttTotaleRegister, plants, price, finalDiscount);
                    break;
                case 2:
                    calculateChange(sc);
                    break;
                case 3:
                    if (line == 0) {
                        System.out.println("Não há registro de venda\nRedirecionando...");
                        break;
                    } else {
                        registerSale(differentPlantsRegister, priceRegister, discountRegister, qttTotaleRegister);
                    }
                    break;
                case 4:
                    dayAndMonth = chooseDay(sc, dayAndMonth);
                    controller++;
                    break;
                case 5:
                    if (controller == 0) {
                        System.out.println("Não há registros de venda\nRedirecionando...");
                        break;
                    } else {
                        queryValue(sc, dayAndMonth);
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }

    public static int getStorage(Scanner sc) {
        System.out.println("Quantas plantas há no seu estoque? ");
        return sc.nextInt();
    }

    public static int showOptions(Scanner sc, int choosenOption) {
        System.out.println("Digite o número da opção que desejas: ");
        System.out.println("[1] - Calcular Preço Total[");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Registrar venda");
        System.out.println("[4] - Escolha o dia e o mês para salvar o valor total");
        System.out.println("[5] - Consultar valor vendido em um dia");
        System.out.println("[6] - Sair");
        return sc.nextInt();
    }

    public static void initializeArrays(Scanner sc, int storage, String[] plants, float[] price) {
        for (int i = 0; i < storage; i++) {
            System.out.println("Qual o nome da planta " + (i + 1) + "?");
            plants[i] = sc.next();
            System.out.println("Qual o preço da " + plants[i] + "?");
            price[i] = sc.nextFloat();
        }
    }

    public static int calculateTotalPrice(Scanner sc, int line, int[] differentPlantsRegister, float[] priceRegister,
            double[] discountRegister, float[] qttTotaleRegister, String[] plants,
            float[] price, double finalDiscount) {
        System.out.print("Quantas plantas o cliente comprou ao total? ");
        int qttBought = sc.nextInt();
        boolean discount = qttBought >= 10;
        int differentPlants = 0;
        float finalPrice = 0f;
        String queryName = "";
        if (qttBought == 1) {
            finalPrice = singleBuy(sc, line, qttTotaleRegister, finalPrice, qttBought, price, plants,
                    differentPlantsRegister);
        } else {
            System.out.println("Quantas plantas diferentes o cliente comprou? ");
            differentPlants = sc.nextInt();
            differentPlantsRegister[line] = differentPlants;
            if (differentPlants != 1) {
                int y = 1;
                while (y <= differentPlants) {
                    System.out.println("Qual o nome da planta comprada?");
                    queryName = sc.next();
                    System.out.println("Qual foi a quantidade comprada da planta " + queryName + "?");
                    int qtt = sc.nextInt();
                    qttTotaleRegister[line] += qtt;
                    for (int x = 0; x < plants.length; x++) {
                        if (queryName.equals(plants[x])) {
                            finalPrice += price[x] * qtt;
                            break;
                        }
                    }
                    y++;
                }
            } else {
                finalPrice = singleBuy(sc, line, qttTotaleRegister, finalPrice, qttBought, price, plants,
                        differentPlantsRegister);
            }
        }
        if (discount) {
            finalDiscount = finalPrice * 0.05;
            finalPrice *= 0.95;
        }
        String format = finalPrice == 1.0f ? "real" : "reais";
        System.out.println("O valor final vendido foi de: " + finalPrice + " " + format);

        priceRegister[line] = finalPrice;
        discountRegister[line] = finalDiscount;
        return ++line;
    }

    public static float singleBuy(Scanner sc, int line, float[] qttTotaleRegister, float finalPrice,
            int qttBought, float[] price, String[] plants, int[] differentPlantsRegister) {
        differentPlantsRegister[line] = 1;
        System.out.println("Qual o nome da planta comprada? ");
        String name = sc.next();
        qttTotaleRegister[line] += qttBought;
        for (int x = 0; x < plants.length; x++) {
            if (name.equals(plants[x])) {
                finalPrice += price[x] * qttBought;
                break;
            }
        }
        return finalPrice;
    }

    public static void calculateChange(Scanner sc) {
        float payment = 0f;
        float total = 0f;
        System.out.println("Qual foi o valor total da compra? ");
        total = sc.nextFloat();
        System.out.println("Qual foi o valor pago pelo cliente? ");
        payment = sc.nextFloat();
        if (payment >= total) {
            float change = payment - total;
            String formatChange = change == 1.0f ? "real" : "reais";
            System.out.println("Troco: " + change + " " + formatChange);
        } else {
            System.out.println("Valor pago menor que o valor total da compra");
        }
    }

    public static void registerSale(int[] differentPlantsRegister, float[] priceRegister,
            double[] discountRegister, float[] qttTotaleRegister) {
        for (int i = 0; i < priceRegister.length; i++) {
            if (priceRegister[i] != 0) {
                System.out.println("Na venda " + (i + 1) + " temos:");
                String formatPlants = qttTotaleRegister[i] != 1 ? " plantas vendidas" : " planta vendida";
                System.out.println("Um total de " + qttTotaleRegister[i] + formatPlants);
                String formatDifferent = differentPlantsRegister[i] == 1 ? " tipo diferente" : " tipos diferentes";
                System.out.println("Sendo de " + differentPlantsRegister[i] + formatDifferent);
                String formatPrice = priceRegister[i] == 1 ? " real" : " reais";
                System.out.println("Com um total vendido de: " + priceRegister[i] + formatPrice);
                String discountFormat = discountRegister[i] == 1 ? " real" : " reais";
                if (discountRegister[i] != 0) {
                    System.out.println("Desconto de " + discountRegister[i] + " " + discountFormat);
                } else {
                    System.out.println("Não houve desconto");
                }
            }
        }
    }

    public static float[][] chooseDay(Scanner sc, float[][] dayAndMonth) {
        int day;
        int month;
        do {
            System.out.println("Qual o dia que deseja registrar?");
            day = sc.nextInt();
        } while (day < 1 || day > 30);
        do {
            System.out.println("E qual o mês em numero deseja registrar?");
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        System.out.println("Qual o valor vendido no dia " + day + " do mês " + month + "?");
        float value = sc.nextFloat();
        dayAndMonth[month - 1][day - 1] = value;
        return dayAndMonth;
    }

    public static void queryValue(Scanner sc, float[][] dayAndMonth) {
        int day;
        int month;
        do {
            System.out.println("Qual dia quer consultar?");
            day = sc.nextInt();
        } while (day < 1 || day > 30);
        do {
            System.out.println("Qual mês em numero?");
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        if (dayAndMonth[month - 1][day - 1] != 0) {
            String stringFormat = dayAndMonth[month - 1][day - 1] != 1 ? " reais" : " real";
            System.out.println("Foi vendido " + dayAndMonth[month - 1][day - 1] + stringFormat);
        } else {
            System.out.println("Não foi vendido neste dia ou não foi registrado");
        }
    }
}