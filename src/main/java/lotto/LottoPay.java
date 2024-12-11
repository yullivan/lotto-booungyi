package lotto;

public class LottoPay {
    private int pay;

    public LottoPay(int pay) {
        if (!(pay % 1000 == 0)) {
            throw new IllegalArgumentException("한장에 1000원입니다.");
        }
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }
}
