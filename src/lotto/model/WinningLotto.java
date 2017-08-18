package lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinningLotto {
    private static final Map<Integer, Integer> winningMoney = new HashMap<>();
    static {
        winningMoney.put(3,  5000);
        winningMoney.put(4,  50000);
        winningMoney.put(5,  1500000);
        winningMoney.put(6,  2000000000);
    }
    
    private List<Integer> lotto;

    public WinningLotto(String lottoNo) {
        String[] values = lottoNo.split(",");
        List<Integer> lotto = new ArrayList<>();
        for (String value : values) {
            lotto.add(Integer.parseInt(value.trim()));
        }
        Collections.sort(lotto);
        this.lotto = lotto;
    }
    
    public int countOfMatch(List<Integer> lotto) {
        List<Integer> result = new ArrayList<>(lotto);
        result.retainAll(this.lotto);
        return result.size();
    }
    
    public static int getWinningmoney(int countOfMatch) {
        return winningMoney.get(countOfMatch);
    }
}
