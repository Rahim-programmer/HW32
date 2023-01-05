public enum Coins {
    FILE(5);
    TEN(10);
    TWENTY_FIVE(25);
private int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
