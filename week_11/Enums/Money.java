package week_11.Enums;

public enum Money {
    ONE_DOLLAR(1),
    TWO_DOLLARS(2),
    FIVE_DOLLARS(5),
    TEN_DOLLARS(10),
    TWENTY_DOLLARS(20);
    private final int denomination;


    Money(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return this.denomination + "$";
    }
}
