package OOPJvHW1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotVendingMashine HVM = new HotVendingMashine();
        HVM.initProductName(List.of(new HotDrinks("Chocolade", 10.5, 200, 100), (new HotDrinks("Tea black", 5.5, 200, 100))));
        System.out.println(HVM.getProductName());
    }
}
