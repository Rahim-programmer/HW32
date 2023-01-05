import java.util.stream.Collectors;

public class VendingMachine {
    private int money;
    private boolean work;


    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
    public static void closeMachine(){
        setWork(false);
    }
    public VendingMachine(){
        product = Product.makeProduct(5).stream()
                .collect(toMap(Product::getId, product - > product));
        work = true;
    }
}

