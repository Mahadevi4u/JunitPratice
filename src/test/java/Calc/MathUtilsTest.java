package Calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {
	
	MathUtils obj;
	@BeforeAll
	 static void before() {
		System.out.println("I am going to start my testing process.");
	}
	
	@BeforeEach
	void init() {
	 obj = new MathUtils();
	}
	
	@Test
	@DisplayName("This test will fail")
	@Disabled
	void testk() {
		fail("Implemented");
	}

	@Test
	void test() {
		
		int expectedAdd = 2;
		int actualAdd = obj.add(1,1);
		assertEquals(expectedAdd,actualAdd);
		
		int expectedSub = 7;
		int actualSub = obj.sub(10,3);
		assertEquals(expectedSub,actualSub);
		
		int expectedMul = 24;
		int actualMul = obj.mul(8,3);
		assertEquals(expectedMul,actualMul);
		
		int expectedRem = 0;
		int actualRem = obj.sub(4,4);
		assertEquals(expectedRem,actualRem);
	}
	
	@Test
	void test2() {
		assertThrows(ArithmeticException.class,()->obj.div(1, 0));
	}
	
	@Test
	void test3() {
		int actualArray[] = obj.a;
		int expectedArray[] = {1,2,3,4};
		assertArrayEquals(expectedArray,actualArray);
		assertThrows(ArrayIndexOutOfBoundsException.class,()->obj.returnArrayValue(8));
		
	
	}
	@AfterAll
	static void close() {
		System.out.println("Completed Running all the tests.");
	}

}
