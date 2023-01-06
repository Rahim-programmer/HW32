public enum Coins {
    FIFTY(50),
    TWENTY(20),
    HUNDRED(100);

private int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
