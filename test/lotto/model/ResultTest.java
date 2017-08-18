package lotto.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultTest {

    @Test
    public void getProfit() {
        Result result = new Result(5);
        result.add(3);
        assertEquals(100.0, result.getProfit(), 0.001);
        
        result.add(4);
        assertEquals(1100.0, result.getProfit(), 0.001);
    }
    
}
