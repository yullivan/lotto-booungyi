package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gameset {

    public static void main(String[] args) {
        LottoPay pay = new LottoPay(1000);
        LottoNumber lottoNumber = new LottoNumber(pay.getPay());
        LottoNumlist lottoNumlist = new LottoNumlist();
        System.out.println(lottoNumlist.numlist());
    }
}
