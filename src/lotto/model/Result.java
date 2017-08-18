package lotto.model;

public class Result {
    private int countOfMatch3 = 0, countOfMatch4 = 0, countOfMatch5 = 0, countOfMatch6 = 0;
    private int countOfLotto;

    public Result(int countOfLotto) {
        this.countOfLotto = countOfLotto;
    }
    
    public int getCountOfLotto() {
        return countOfLotto;
    }
    
    public int getCountOfMatch3() {
        return countOfMatch3;
    }
    
    public int getCountOfMatch4() {
        return countOfMatch4;
    }
    
    public int getCountOfMatch5() {
        return countOfMatch5;
    }
    
    public int getCountOfMatch6() {
        return countOfMatch6;
    }
    
    public void add(int countOfMatch) {
        if (countOfMatch == 3) {
            countOfMatch3++;
            return;
        }
        
        if (countOfMatch == 4) {
            countOfMatch4++;
            return;
        }
        
        if (countOfMatch == 5) {
            countOfMatch5++;
            return;
        }
        
        if (countOfMatch == 6) {
            countOfMatch6++;
            return;
        }
    }
    
    public double getProfit() {
        int buyingMoney = countOfLotto * UserLotto.MONEY_PER_TICKET;
        int winningMoney = 0;
        winningMoney += (countOfMatch3 * WinningLotto.getWinningmoney(3)); 
        winningMoney += (countOfMatch4 * WinningLotto.getWinningmoney(4)); 
        winningMoney += (countOfMatch5 * WinningLotto.getWinningmoney(5)); 
        winningMoney += (countOfMatch6 * WinningLotto.getWinningmoney(6));
        System.out.println("Winning Money : " + winningMoney);
        return (winningMoney * 100)/buyingMoney;
    }
}
