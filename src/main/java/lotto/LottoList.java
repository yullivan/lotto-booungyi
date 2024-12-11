package lotto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoList {
    List<Integer> lottolist() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        list = list.subList(0, 6);
        return list;
    }

}
