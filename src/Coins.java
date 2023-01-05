public enum Coins {
    FIFTY(50),
    SEVENTY(70),
    NINETY(90);

private int value;

    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
