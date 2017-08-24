package lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {
    public enum Match {
        MATCH3(3, 5000),
        MATCH4(4, 50000),
        MATCH5(5, 1500000),
        MATCH6(6, 2000000000);
        
        private int countOfMatch;
        private int winningMoney;

        private Match(int countOfMatch, int winningMoney) {
            this.countOfMatch = countOfMatch;
            this.winningMoney = winningMoney;
        }

        public static Match valueOf(int countOfMatch) {
            Match[] values = values();
            for (Match match2 : values) {
                if (match2.countOfMatch == countOfMatch) {
                    return match2;
                }
            }
            throw new IllegalArgumentException(countOfMatch + "는 유효하지 않은 값입니다.");
        }

        public long winningMoney(int countOfMatchingLotto) {
            return winningMoney * countOfMatchingLotto;
        }
        
        public int getCountOfMatch() {
            return countOfMatch;
        }
    }
    
    private List<MatchingResult> results = new ArrayList<>();
    
    private int countOfLotto;

    public Result(int countOfLotto) {
        this.countOfLotto = countOfLotto;
        
        results.add(new MatchingResult(Match.MATCH3));
        results.add(new MatchingResult(Match.MATCH4));
        results.add(new MatchingResult(Match.MATCH5));
        results.add(new MatchingResult(Match.MATCH6));
    }

    public void add(Match match) {
        if (match == null) {
            return;
        }
        
        results.stream().filter(e -> e.supports(match)).findFirst().get().match();
    }

    public double getProfit() {
        int buyingMoney = countOfLotto * UserLotto.MONEY_PER_TICKET;
        long winningMoney = 0;
        
        for (MatchingResult matchingResult : results) {
            winningMoney += matchingResult.winningMoney();
        }
        
        System.out.println("Winning Money : " + winningMoney);
        return (winningMoney * 100) / buyingMoney;
    }
    
    public List<MatchingResult> getResults() {
        return Collections.unmodifiableList(results);
    }
    
    public int getCountOfLotto() {
        return countOfLotto;
    }
    
    public static class MatchingResult {
        private int countOfMatchingLotto = 0;
        private Match match;

        private MatchingResult(Match match) {
            this.match = match;
        }
        
        public boolean supports(Match match) {
            return this.match == match;
        }
        
        public void match() {
            countOfMatchingLotto++;
        }
        
        public int getCountOfMatchingLotto() {
            return countOfMatchingLotto;
        }
        
        public int getCountOfMatch() {
            return match.getCountOfMatch();
        }
        
        public long winningMoney() {
            return match.winningMoney(countOfMatchingLotto);
        }
    }
}
