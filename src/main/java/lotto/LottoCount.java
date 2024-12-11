package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoCount {
    private int count;

    public LottoCount(LottoPay pay) {
        this.count = pay.getPay() / 1000;
    }

    public int getCount() {
        return count;
    }

}

