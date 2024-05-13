package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

import java.util.Date;

public class ProcessaPedido extends Pedido {
    private Item[] order;
    private float total = 0;

    @SuppressWarnings({ "deprecation" })
    public ProcessaPedido(int[] qtt, Item[] order,
            Cliente customer, Vendedor seller, Loja store, Date creation,
            int paymentDay, int paymentMonth) {
        this.order = order;

        for (int i = 0; i < order.length; i++) {
            if (order[i] == null) {
                break;
            }
            total += order[i].getPrice() * qtt[i];
        }
        setTotalPrice(total);
        setCustomer(customer);
        ;
        setSeller(seller);
        ;
        setStore(store);
        ;
        setCreation(creation);
        ;
        setPaymentDay(paymentDay);
        setPaymentMonth(paymentMonth);
        setPaymentDate(new Date(124, paymentMonth - 1, paymentDay));
        setLimitDate(new Date(this.getCreation().getTime() + (5 * 86400000)));

    }

    private boolean confirm() {

        Date now = new Date();

        if (now.getTime() > getLimitDate().getTime()) {
            return false;
        }

        return true;
    }
}
