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
}

