package study;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import sis.studentinfo.Student;

public class ArrayListTest {
    @Test
    public void study() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");

        assertEquals(2, list.size()); // list의 크기를 구하라.
         assertEquals("first", list.get(0) ); // 첫 번째 값을 찾아라.
         assertEquals(true, list.contains("first") ); // "first" 값이 포함되어 있는지를 확인해라.
        // assertEquals("first", (  ) ); // 첫 번째 값을 삭제해라.
        // assertEquals(false, (  ) ); // "first" 값이 포함되어 있는지를 확인해라.
         
         list.set(0, "third");
         assertEquals("third", list.get(0));
    }
    
    @Test
	public void study2() throws Exception {
    	ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("first"));
        list.add(new Student("second"));
        
        assertEquals(true, list.contains(new Student("first")));
	}
}
