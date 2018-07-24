package helloword;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.helloword.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testConcatenate() {
        HelloWorld myUnit = new HelloWorld();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

}
