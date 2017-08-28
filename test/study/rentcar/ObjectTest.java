package study.rentcar;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObjectTest {
	private static class MyClass {
		private String name;

		public MyClass(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyClass other = (MyClass) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}
		
	@Test
	public void test() {
		MyClass clazz1 = new MyClass("테스트");
		MyClass clazz2 = new MyClass("테스트");
		assertEquals(clazz1, clazz2);
	}

}
