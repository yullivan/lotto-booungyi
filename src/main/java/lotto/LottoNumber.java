package lotto;

public class LottoNumber {
    private int number;

    public void setNumber(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("1부터 45사이");
        }
        this.number = number;
    }
}
