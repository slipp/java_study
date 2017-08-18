package lotto.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import lotto.model.Lottos;
import lotto.model.Result;
import lotto.model.UserLotto;
import lotto.model.WinningLotto;

public class LottosTest {

    @Test
    public void match() {
        List<UserLotto> userLottos = new ArrayList<>();
        userLottos.add(new UserLotto(Arrays.asList(1, 2, 3, 4, 5, 6)));
        userLottos.add(new UserLotto(Arrays.asList(1, 2, 3, 4, 7, 8)));
        userLottos.add(new UserLotto(Arrays.asList(9, 10, 11, 12, 13, 14)));
        userLottos.add(new UserLotto(Arrays.asList(9, 10, 15, 16, 17, 18)));
        
        Lottos lottos = new Lottos(userLottos);
        WinningLotto lotto = new WinningLotto("1, 2, 3, 4, 5, 6");
        Result result = lottos.match(lotto);
        assertEquals(4, result.getCountOfLotto());
        assertEquals(0, result.getCountOfMatch3());
        assertEquals(1, result.getCountOfMatch4());
        assertEquals(0, result.getCountOfMatch5());
        assertEquals(1, result.getCountOfMatch6());
    }
}
