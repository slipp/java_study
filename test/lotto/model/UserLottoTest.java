package lotto.model;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import lotto.model.UserLotto;
import lotto.model.WinningLotto;

public class UserLottoTest {
    @Test
    public void match() throws Exception {
        UserLotto userLotto = new UserLotto(Arrays.asList(1, 2, 3, 4, 7, 8));
        WinningLotto winningLotto = new WinningLotto("1, 2, 3, 4, 5, 6");
        int result = userLotto.countOfMatch(winningLotto);
        assertEquals(4, result);
    }
}
