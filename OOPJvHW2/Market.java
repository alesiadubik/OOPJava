package OOPJvHW2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Human> humans = new ArrayList<>();
    Queue<Actor> actors = new ArrayDeque();

    @Override
    public void acceptToMarket(Human humans) {
        System.out.println(humans.getName() + " came to the cafe");
    }

    @Override
    public void releaseFromMarket(Human humans) {
        System.out.println(humans.getName() + " left the cafe");

    }

    @Override
    public void update() {

    }

    @Override
    public void takeQueue(Human humans) {
        this.actors.add(humans);
        System.out.println(((Human) humans).getName() + " take the queue");
    }

    @Override
    public void takeOrders() {
        System.out.println(this.actors.peek().getName() + " make the order");
        this.actors.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        System.out.println(this.actors.peek().getName() + " get the order");
        this.actors.peek().setTakeOrder();
    }

    @Override
    public void releaseFromQueue(Human humans) {
        this.actors.remove(humans);
        System.out.println(humans.getName() + " left the queue");
    }

}