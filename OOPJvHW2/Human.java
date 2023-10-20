package OOPJvHW2;

public class Human extends Actor implements ActorBehaviour {


    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Oder accepted");
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Oder is issued");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}