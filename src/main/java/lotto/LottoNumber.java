package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumber {
    private int number;
    public static List<LottoNumber> list = new ArrayList<>();

    public LottoNumber(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("로또 숫자는 1부터 45 사이입니다.");
        }
        this.number = number;
    }

    public static List<LottoNumber> getList() {
        return list;
    }


    public int getNumber() {
        return number;
    }

}
