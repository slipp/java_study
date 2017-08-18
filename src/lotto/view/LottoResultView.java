package lotto.view;

import lotto.model.Result;
import lotto.model.WinningLotto;

public class LottoResultView {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String LOTTO_REPORT_HEADER = "당첨 통계" + NEWLINE + "----" + NEWLINE;
    public static final String LOTTO_REPORT_FOOTER = "총 수익률은 %d 입니다.";
    
    public static void show(Result result) {
        StringBuilder sb = new StringBuilder(LOTTO_REPORT_HEADER);
        
        appendByMatch(sb, 3, result.getCountOfMatch3());
        appendByMatch(sb, 4, result.getCountOfMatch4());
        appendByMatch(sb, 5, result.getCountOfMatch5());
        appendByMatch(sb, 6, result.getCountOfMatch6());
        sb.append("총 수익률은 ");
        sb.append(result.getProfit());
        sb.append("%입니다.");
        
        System.out.println(sb.toString());
    }

    private static void appendByMatch(StringBuilder sb, int countOfMatch, int noOfMatch) {
        sb.append(countOfMatch);
        sb.append("개 일치 (");
        sb.append(WinningLotto.getWinningmoney(countOfMatch));
        sb.append(") - ");
        sb.append(noOfMatch);
        sb.append("개");
        sb.append(NEWLINE);
    }
}
