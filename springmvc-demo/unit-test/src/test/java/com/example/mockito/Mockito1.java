package com.example.mockito;

//Let's import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Mockito1 {

	/**
	 * 1.验证行为
	 */
	@Test
	public void listTest() {
		 //mock creation
		 List mockedList = mock(List.class);

		 //using mock object
		 mockedList.add("one");
		 mockedList.clear();

		 //verification
		 verify(mockedList).add("one");
		 verify(mockedList).clear();
		 //一旦创建 mock 将会记得所有的交互。你可以选择验证你感兴趣的任何交互
	}
	
	/**
	 * 2.stubbing
	 */
	@Test(expected=RuntimeException.class)
	public void stubbingTest() {
		 //You can mock concrete classes, not just interfaces
		 LinkedList mockedList = mock(LinkedList.class);
		 
		 //stubbing
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());
		 
		 //following prints "first"
		 System.out.println(mockedList.get(0));

		 //following throws runtime exception
		 System.out.println(mockedList.get(1));

		 //following prints "null" because get(999) was not stubbed
		 System.out.println(mockedList.get(999));
		 
		 //Although it is possible to verify a stubbed invocation, usually it's just redundant
		 //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
		 //If your code doesn't care what get(0) returns, then it should not be stubbed.
		 /*
		 verify(mockedList).get(0);

		    默认情况下，所有方法都会返回值，一个 mock 将返回要么 null，一个原始/基本类型的包装值或适当的空集。例如，对于一个 int/Integer 就是 0，而对于 boolean/Boolean 就是 false。
		    Stubbing 可以被覆盖。
		    一旦 stub，该方法将始终返回一个 stub 的值，无论它有多少次被调用。
		    最后的 stubbing 是很重要的 - 当你使用相同的参数 stub 多次同样的方法。换句话说：stubbing 的顺序是重要的，但它唯一有意义的却很少，例如当 stubbing 完全相同的方法调用，或者有时当参数匹配器的使用，等等。
		*/
	}
	
	/**
	 * 3.参数匹配器(Argument matchers)
	 * 
	 * Mockito 验证参数值使用 Java 方式：通过使用 equals() 方法。有时，当需要额外的灵活性，可以使用参数匹配器：
	 * 
	 */
	@Test
	public void argument_matchersTest() {
		
		LinkedList mockedList = mock(LinkedList.class);
		
		 //stubbing using built-in anyInt() argument matcher
		 when(mockedList.get(anyInt())).thenReturn("element");

		 //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
		// when(mockedList.contains(argThat(isValid()))).thenReturn(true);

		 //following prints "element"
		 System.out.println(mockedList.get(999));

		 //you can also verify using an argument matcher
		 verify(mockedList).get(anyInt());

		 //argument matchers can also be written as Java 8 Lambdas
		 //verify(mockedList).add(argThat(someString -> someString.length() > 5));
	}
}
