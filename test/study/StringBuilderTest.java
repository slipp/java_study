package study;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBuilderTest {
	@Test
    public void append () {
        assertEquals("코드스쿼드 화이트 레벨 수강생은? 18 명이다.", createMessage(18));
    }

    private String createMessage(int numberOfClass) {
        StringBuilder sb = new StringBuilder();
        sb.append("코드스쿼드 화이트 레벨 수강생은? ");
        sb.append(18);
        sb.append(" 명이다.");
        return sb.toString();
    }
}
