package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Mytest {

	Checking ch;
	String a;
	@BeforeEach
	public void test1() {
		 ch=new Checking();
	}
	@Test
	void test() {
		
		 a=ch.check("ABCD");
		assertEquals("BCD",a);
	}
	
	@Test
	void test2() {
		
		 a=ch.check("AACD");
		assertEquals("CD",a);
	}
	@Test
	void test3() {
		
		 a=ch.check("BBAA");
		assertEquals("BBAA",a);
		
	}
	@Test
	void test4() {
		
		 a=ch.check("AABAA");
		assertEquals("BAA",a);
		
	}
	

}
