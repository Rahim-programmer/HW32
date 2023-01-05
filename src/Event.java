import java.util.Map;

public enum Event {

    ADD_COIN("Закинуть ёще монету"){
        @Override
        public void run(VendingMachine machine, String productId){
            String value;
            System.out.println("Выберите какую монетку положить в автомат:");
            var coins = Map.of("1",Coins.FIFTY, "2", Coins.SEVENTY, "3", Coins.NINETY);
            coins.forEach(number, coin)-> {
                System.out.printf(number);
            };
        }
    }
}
