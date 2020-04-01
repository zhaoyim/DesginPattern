package design.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> list = new ArrayList<Order>();

    public void takeOrder(Order order) {
        list.add(order);
    }

    public void placeOrders() {
        for (Order o : list) {
            o.execute();
        }
        list.clear();
    }
}
