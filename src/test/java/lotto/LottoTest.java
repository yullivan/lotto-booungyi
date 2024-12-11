package lotto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LottoTest {
    @Test
    void lottowarning() {
        LottoNumber lottoNumber = new LottoNumber(1000);
//        assertThatThrownBy(() ->lottoNumber.getNumber()isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void LottopayTest() {
        assertThatThrownBy(() -> new LottoPay(1100)).isInstanceOf(IllegalArgumentException.class);
        assertThat(new LottoPay(1000).getPay()).isEqualTo(1000);
    }

    @Test
    void lottocountTest() {

        LottoPay pay = new LottoPay(1000);
        LottoCount count = new LottoCount(pay);

        assertThat(count.getCount()).isEqualTo(1);
    }

    @Test
    void lottolist() {
        LottoNumlist list = new LottoNumlist();

    }

}
