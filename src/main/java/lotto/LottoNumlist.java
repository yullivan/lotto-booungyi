package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumlist {
    //LottoNumber 로 매핑한 number 변수 사용
    //lottoList 를 number 변수로 매핑하기

    public List<LottoNumber> numlist() {
        LottoList lottoList = new LottoList();
        List<LottoNumber> numbers = new ArrayList<>();

        for (Integer integer : lottoList.lottolist()) {
            numbers.add(new LottoNumber(integer));
        }
        return numbers;
    }

}
